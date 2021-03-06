package com.nexuslink.model.personfriendmodel;

import com.nexuslink.config.Api;
import com.nexuslink.config.Constants;
import com.nexuslink.model.CallBackListener;
import com.nexuslink.model.FriendsInfo;
import com.nexuslink.model.data.FansInfo;
import com.nexuslink.util.ApiUtil;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 猿人 on 2017/4/8.
 */

public class FriendModelImpl implements IFriendModel<List<FriendsInfo.UsersBean>> {

    private Api api = ApiUtil.getInstance(Constants.BASE_URL);


    @Override
    public void getFansInfo(int uId, final CallBackListener listener) {
        api.getFans(uId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<FansInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(FansInfo fansInfo) {
                        if (fansInfo.getCode() == Constants.SUCCESS) {
                            listener.onFinish(fansInfo.getFans());
                        } else {
                            listener.onError(new Exception("请求朋友出错了"));
                        }
                    }
                });
    }

    @Override
    public void getFriendInfo(int uId, final CallBackListener<List<FriendsInfo.UsersBean>> listener) {
        api.getFriends(uId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<FriendsInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(FriendsInfo friendsInfo) {
                        if (friendsInfo.getCode() == Constants.SUCCESS) {
                            listener.onFinish(friendsInfo.getUsers());
                        } else {
                            listener.onError(new Exception("请求朋友出错了"));
                        }
                    }
                });
    }
}
