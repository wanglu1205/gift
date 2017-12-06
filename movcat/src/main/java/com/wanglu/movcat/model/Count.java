package com.wanglu.movcat.model;

//计数
public class Count {

    private Integer commentCount;

    private Integer praiseCount;

    private Integer shareCount;

    private Integer totalBrowsingCount;

    private Integer todayBrowsingCount;

    public Count() {
    }

    public Count(Integer commentCount, Integer praiseCount, Integer shareCount, Integer totalBrowsingCount, Integer todayBrowsingCount) {
        this.commentCount = commentCount;
        this.praiseCount = praiseCount;
        this.shareCount = shareCount;
        this.totalBrowsingCount = totalBrowsingCount;
        this.todayBrowsingCount = todayBrowsingCount;
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

    public Integer getTotalBrowsingCount() {
        return totalBrowsingCount;
    }

    public void setTotalBrowsingCount(Integer totalBrowsingCount) {
        this.totalBrowsingCount = totalBrowsingCount;
    }

    public Integer getTodayBrowsingCount() {
        return todayBrowsingCount;
    }

    public void setTodayBrowsingCount(Integer todayBrowsingCount) {
        this.todayBrowsingCount = todayBrowsingCount;
    }

    @Override
    public String toString() {
        return "Count{" +
                "commentCount=" + commentCount +
                ", praiseCount=" + praiseCount +
                ", shareCount=" + shareCount +
                ", totalBrowsingCount=" + totalBrowsingCount +
                ", todayBrowsingCount=" + todayBrowsingCount +
                '}';
    }
}
