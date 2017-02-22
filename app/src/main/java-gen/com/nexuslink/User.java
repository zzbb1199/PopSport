package com.nexuslink;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table USER.
 */
public class User {

    private Long id;
    private Integer uid;
    private String uName;
    private String uGender;
    private String uImg;
    private Integer uHeight;
    private Integer uWeight;
    private Integer uFansNum;
    private Integer uExp;
    private Long uHistoryStep;
    private Long uHistoryMileage;
    private Long uBestRecordStep;
    private Long uBestRecordMileage;
    private String uAchievements;
    private Integer uFollowedNum;
    private Integer already;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, Integer uid, String uName, String uGender, String uImg, Integer uHeight, Integer uWeight, Integer uFansNum, Integer uExp, Long uHistoryStep, Long uHistoryMileage, Long uBestRecordStep, Long uBestRecordMileage, String uAchievements, Integer uFollowedNum, Integer already) {
        this.id = id;
        this.uid = uid;
        this.uName = uName;
        this.uGender = uGender;
        this.uImg = uImg;
        this.uHeight = uHeight;
        this.uWeight = uWeight;
        this.uFansNum = uFansNum;
        this.uExp = uExp;
        this.uHistoryStep = uHistoryStep;
        this.uHistoryMileage = uHistoryMileage;
        this.uBestRecordStep = uBestRecordStep;
        this.uBestRecordMileage = uBestRecordMileage;
        this.uAchievements = uAchievements;
        this.uFollowedNum = uFollowedNum;
        this.already = already;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUName() {
        return uName;
    }

    public void setUName(String uName) {
        this.uName = uName;
    }

    public String getUGender() {
        return uGender;
    }

    public void setUGender(String uGender) {
        this.uGender = uGender;
    }

    public String getUImg() {
        return uImg;
    }

    public void setUImg(String uImg) {
        this.uImg = uImg;
    }

    public Integer getUHeight() {
        return uHeight;
    }

    public void setUHeight(Integer uHeight) {
        this.uHeight = uHeight;
    }

    public Integer getUWeight() {
        return uWeight;
    }

    public void setUWeight(Integer uWeight) {
        this.uWeight = uWeight;
    }

    public Integer getUFansNum() {
        return uFansNum;
    }

    public void setUFansNum(Integer uFansNum) {
        this.uFansNum = uFansNum;
    }

    public Integer getUExp() {
        return uExp;
    }

    public void setUExp(Integer uExp) {
        this.uExp = uExp;
    }

    public Long getUHistoryStep() {
        return uHistoryStep;
    }

    public void setUHistoryStep(Long uHistoryStep) {
        this.uHistoryStep = uHistoryStep;
    }

    public Long getUHistoryMileage() {
        return uHistoryMileage;
    }

    public void setUHistoryMileage(Long uHistoryMileage) {
        this.uHistoryMileage = uHistoryMileage;
    }

    public Long getUBestRecordStep() {
        return uBestRecordStep;
    }

    public void setUBestRecordStep(Long uBestRecordStep) {
        this.uBestRecordStep = uBestRecordStep;
    }

    public Long getUBestRecordMileage() {
        return uBestRecordMileage;
    }

    public void setUBestRecordMileage(Long uBestRecordMileage) {
        this.uBestRecordMileage = uBestRecordMileage;
    }

    public String getUAchievements() {
        return uAchievements;
    }

    public void setUAchievements(String uAchievements) {
        this.uAchievements = uAchievements;
    }

    public Integer getUFollowedNum() {
        return uFollowedNum;
    }

    public void setUFollowedNum(Integer uFollowedNum) {
        this.uFollowedNum = uFollowedNum;
    }

    public Integer getAlready() {
        return already;
    }

    public void setAlready(Integer already) {
        this.already = already;
    }

}
