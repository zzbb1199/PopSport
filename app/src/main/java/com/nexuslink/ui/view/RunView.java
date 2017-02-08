package com.nexuslink.ui.view;

/**
 * Created by 猿人 on 2017/1/28.
 */

public interface RunView {
    //标题动画
    void startTitleAnim();
    void endTitleAnim();
    //时间
    void setCurrentTime(String realTime);
    //速度
    void setCurrentSpeed(String speed);
    //设置能量
    void setCurrentCol(String col);
    //设置当前公里数
    void setCurrentDistance(String miles);
}