package com.nexuslink.model.articledetailsmodel;

import com.nexuslink.config.Api;
import com.nexuslink.config.Constants;
import com.nexuslink.model.CallBackListener;
import com.nexuslink.model.data.CommentInfo;
import com.nexuslink.model.data.CommentResult;
import com.nexuslink.model.data.PostDisLike;
import com.nexuslink.model.data.PostLikeResult;
import com.nexuslink.model.data.SingleCommunityInfo;
import com.nexuslink.util.ApiUtil;
import com.nexuslink.util.UserUtils;

import java.net.SocketTimeoutException;
import java.util.concurrent.TimeoutException;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 猿人 on 2017/2/25.
 */

public class ArticleDetailModelImpl implements ArticleDetailModel {
    Api api = ApiUtil.getInstance(Constants.BASE_URL);
    @Override
    public void postLike(int userId, int articleId, final CallBackListener listener) {
        api.postLike(userId,articleId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<PostLikeResult>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(PostLikeResult result) {
                        if(result.getCode() == Constants.SUCCESS){
                            listener.onFinish(null);
                        }else{
                            listener.onError(new Exception("点赞时出错"));
                        }
                    }
                });
    }

    @Override
    public void postDisLike(int userId, int articleId, final CallBackListener listener) {
            api.postDisLike(userId,articleId).subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<PostDisLike>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {

                        }

                        @Override
                        public void onNext(PostDisLike postDisLike) {
                            if(postDisLike.getCode() == Constants.SUCCESS){
                                listener.onFinish(null);
                            }else{
                                listener.onError(new Exception("取消点赞失败"));
                            }
                        }
                    });
    }

    @Override
    public void postComment(int userId, int articleId, String text, final CallBackListener listener) {
            api.postComment(userId,articleId,text)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(new Subscriber<CommentResult>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            listener.onError((Exception) e);
                        }

                        @Override
                        public void onNext(CommentResult commentResult) {
                            if(commentResult.getCode() == Constants.SUCCESS){
                                listener.onFinish(null);
                            }else{
                                listener.onError(new Exception("进行评论时出错，请重试..."));
                            }
                        }
                    });
    }

    @Override
    public void getComments(int articleId, final CallBackListener listener) {
        api.getComment(articleId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<CommentInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        listener.onError((Exception) e);
                    }

                    @Override
                    public void onNext(CommentInfo commentInfo) {
                        if(commentInfo.getCode() == Constants.SUCCESS){
                            listener.onFinish(commentInfo.getComments());
                        }else{
                            listener.onFinish(new Exception("取回评论时出错"));
                        }
                    }
                });
    }

    @Override
    public void getArticle(int articleId, final CallBackListener listener) {
        api.getArticle(UserUtils.getUserId(),articleId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<SingleCommunityInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        if(e instanceof TimeoutException || e instanceof SocketTimeoutException){
                            listener.onError((Exception) e);
                        }
                    }

                    @Override
                    public void onNext(SingleCommunityInfo singleCommunityInfo) {
                        if(singleCommunityInfo.getCode() == Constants.SUCCESS){
                            listener.onFinish(singleCommunityInfo.getArticle());
                        }else{
                            listener.onError(new Exception("加载话题出错"));
                        }
                    }
                });
    }
}
