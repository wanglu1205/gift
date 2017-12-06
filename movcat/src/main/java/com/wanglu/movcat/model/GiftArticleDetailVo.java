package com.wanglu.movcat.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GiftArticleDetailVo {

    private Integer giftArticleId;

    private String giftArticleImgUrl;

    private String giftArticleTitle;

    private Date giftArticleCreateTime;

    private String giftArticleDetails;

    private Integer giftId;

    private String giftName;

    private String giftImgUrl;

    private String giftvideoUrl;

    private BigDecimal giftPrice;

    private String giftIntro;

    private String giftMallUrl;

    private Integer commentCount;

    private Integer praiseCount;

    private Integer shareCount;

    private Integer userId;

    private String userName;

    private String userImgUrl;

    private List<CommentVo> commentVoList;

    public GiftArticleDetailVo() {
    }

    public GiftArticleDetailVo(Integer giftArticleId, String giftArticleImgUrl, String giftArticleTitle, Date giftArticleCreateTime, String giftArticleDetails, Integer giftId, String giftName, String giftImgUrl, String giftvideoUrl, BigDecimal giftPrice, String giftIntro, String giftMallUrl, Integer commentCount, Integer praiseCount, Integer shareCount, Integer userId, String userName, String userImgUrl) {
        this.giftArticleId = giftArticleId;
        this.giftArticleImgUrl = giftArticleImgUrl;
        this.giftArticleTitle = giftArticleTitle;
        this.giftArticleCreateTime = giftArticleCreateTime;
        this.giftArticleDetails = giftArticleDetails;
        this.giftId = giftId;
        this.giftName = giftName;
        this.giftImgUrl = giftImgUrl;
        this.giftvideoUrl = giftvideoUrl;
        this.giftPrice = giftPrice;
        this.giftIntro = giftIntro;
        this.giftMallUrl = giftMallUrl;
        this.commentCount = commentCount;
        this.praiseCount = praiseCount;
        this.shareCount = shareCount;
        this.userId = userId;
        this.userName = userName;
        this.userImgUrl = userImgUrl;
    }

    public GiftArticleDetailVo(Integer giftArticleId, String giftArticleImgUrl, String giftArticleTitle, Date giftArticleCreateTime, String giftArticleDetails, Integer giftId, String giftName, String giftImgUrl, String giftvideoUrl, BigDecimal giftPrice, String giftIntro, String giftMallUrl, Integer commentCount, Integer praiseCount, Integer shareCount, Integer userId, String userName, String userImgUrl, List<CommentVo> commentVoList) {
        this.giftArticleId = giftArticleId;
        this.giftArticleImgUrl = giftArticleImgUrl;
        this.giftArticleTitle = giftArticleTitle;
        this.giftArticleCreateTime = giftArticleCreateTime;
        this.giftArticleDetails = giftArticleDetails;
        this.giftId = giftId;
        this.giftName = giftName;
        this.giftImgUrl = giftImgUrl;
        this.giftvideoUrl = giftvideoUrl;
        this.giftPrice = giftPrice;
        this.giftIntro = giftIntro;
        this.giftMallUrl = giftMallUrl;
        this.commentCount = commentCount;
        this.praiseCount = praiseCount;
        this.shareCount = shareCount;
        this.userId = userId;
        this.userName = userName;
        this.userImgUrl = userImgUrl;
        this.commentVoList = commentVoList;
    }

    public Integer getGiftArticleId() {
        return giftArticleId;
    }

    public void setGiftArticleId(Integer giftArticleId) {
        this.giftArticleId = giftArticleId;
    }

    public String getGiftArticleImgUrl() {
        return giftArticleImgUrl;
    }

    public void setGiftArticleImgUrl(String giftArticleImgUrl) {
        this.giftArticleImgUrl = giftArticleImgUrl;
    }

    public String getGiftArticleTitle() {
        return giftArticleTitle;
    }

    public void setGiftArticleTitle(String giftArticleTitle) {
        this.giftArticleTitle = giftArticleTitle;
    }

    public Date getGiftArticleCreateTime() {
        return giftArticleCreateTime;
    }

    public void setGiftArticleCreateTime(Date giftArticleCreateTime) {
        this.giftArticleCreateTime = giftArticleCreateTime;
    }

    public String getGiftArticleDetails() {
        return giftArticleDetails;
    }

    public void setGiftArticleDetails(String giftArticleDetails) {
        this.giftArticleDetails = giftArticleDetails;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftImgUrl() {
        return giftImgUrl;
    }

    public void setGiftImgUrl(String giftImgUrl) {
        this.giftImgUrl = giftImgUrl;
    }

    public String getGiftvideoUrl() {
        return giftvideoUrl;
    }

    public void setGiftvideoUrl(String giftvideoUrl) {
        this.giftvideoUrl = giftvideoUrl;
    }

    public BigDecimal getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(BigDecimal giftPrice) {
        this.giftPrice = giftPrice;
    }

    public String getGiftIntro() {
        return giftIntro;
    }

    public void setGiftIntro(String giftIntro) {
        this.giftIntro = giftIntro;
    }

    public String getGiftMallUrl() {
        return giftMallUrl;
    }

    public void setGiftMallUrl(String giftMallUrl) {
        this.giftMallUrl = giftMallUrl;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public List<CommentVo> getCommentVoList() {
        return commentVoList;
    }

    public void setCommentVoList(List<CommentVo> commentVoList) {
        this.commentVoList = commentVoList;
    }


    @Override
    public String toString() {
        return "GiftArticleDetailVo{" +
                "giftArticleId=" + giftArticleId +
                ", giftArticleImgUrl='" + giftArticleImgUrl + '\'' +
                ", giftArticleTitle='" + giftArticleTitle + '\'' +
                ", giftArticleCreateTime=" + giftArticleCreateTime +
                ", giftArticleDetails='" + giftArticleDetails + '\'' +
                ", giftId=" + giftId +
                ", giftName='" + giftName + '\'' +
                ", giftImgUrl='" + giftImgUrl + '\'' +
                ", giftvideoUrl='" + giftvideoUrl + '\'' +
                ", giftPrice=" + giftPrice +
                ", giftIntro='" + giftIntro + '\'' +
                ", giftMallUrl='" + giftMallUrl + '\'' +
                ", commentCount=" + commentCount +
                ", praiseCount=" + praiseCount +
                ", shareCount=" + shareCount +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userImgUrl='" + userImgUrl + '\'' +
                ", commentVoList=" + commentVoList +
                '}';
    }
}
