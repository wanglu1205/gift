package com.wanglu.movcat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

public class SonCommentVo {

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

    //用户头像
    private String userImgUrl;

    //父主键
    private Integer fatherId;

    private List<GrandsonCommentVo> grandsonCommentVoList;

    public SonCommentVo() {
    }

    public SonCommentVo(String content, Integer floor, Date createTime, Integer userId, String userName, String userImgUrl, Integer fatherId) {
        this.content = content;
        this.floor = floor;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
        this.userImgUrl = userImgUrl;
        this.fatherId = fatherId;
    }

    public SonCommentVo(String content, Integer floor, Date createTime, Integer userId, String userName, String userImgUrl, Integer fatherId, List<GrandsonCommentVo> grandsonCommentVoList) {
        this.content = content;
        this.floor = floor;
        this.createTime = createTime;
        this.userId = userId;
        this.userName = userName;
        this.userImgUrl = userImgUrl;
        this.fatherId = fatherId;
        this.grandsonCommentVoList = grandsonCommentVoList;
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

    public String getUserImgUrl() {
        return userImgUrl;
    }

    public void setUserImgUrl(String userImgUrl) {
        this.userImgUrl = userImgUrl;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public List<GrandsonCommentVo> getGrandsonCommentVoList() {
        return grandsonCommentVoList;
    }

    public void setGrandsonCommentVoList(List<GrandsonCommentVo> grandsonCommentVoList) {
        this.grandsonCommentVoList = grandsonCommentVoList;
    }

    @Override
    public String toString() {
        return "SonCommentVo{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", floor=" + floor +
                ", createTime=" + createTime +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userImgUrl='" + userImgUrl + '\'' +
                ", fatherId=" + fatherId +
                ", grandsonCommentVoList=" + grandsonCommentVoList +
                '}';
    }
}
