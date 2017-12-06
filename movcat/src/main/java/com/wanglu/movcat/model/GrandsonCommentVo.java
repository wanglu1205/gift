package com.wanglu.movcat.model;

import java.util.Date;

public class GrandsonCommentVo {

    //主键
    private Integer id;

    //内容
    private String content;

    //第几楼
    private Integer floor;

    //创建时间
    private Date createTime;

    //用户主键
    private Integer userId;

    //用户名称
    private String userName;

    //回复谁 用户主键
    private Integer replyUserId;

    //回复谁 用户名称
    private String replyUserName;

    //父主键
    private Integer fatherId;

    //回复评论主键
    private Integer replyId;

    public GrandsonCommentVo() {
    }



    public GrandsonCommentVo(Integer id, String content, Integer floor, Date createTime, Integer userId, String userName, Integer replyUserId, String replyUserName, Integer fatherId, Integer replyId) {
        this.id = id;
        this.content = content;
        this.floor = floor;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
        this.replyUserId = replyUserId;
        this.replyUserName = replyUserName;
        this.fatherId = fatherId;
        this.replyId = replyId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Integer replyUserId) {
        this.replyUserId = replyUserId;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public String getReplyUserName() {
        return replyUserName;
    }

    public void setReplyUserName(String replyUserName) {
        this.replyUserName = replyUserName;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    @Override
    public String toString() {
        return "GrandsonCommentVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", floor=" + floor +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", replyUserId=" + replyUserId +
                ", replyUserName='" + replyUserName + '\'' +
                ", fatherId=" + fatherId +
                ", replyId=" + replyId +
                '}';
    }
}