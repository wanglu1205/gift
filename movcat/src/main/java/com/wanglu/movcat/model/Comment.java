package com.wanglu.movcat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Comment {

    //主键
    @Id
    @GeneratedValue
    private Integer id;

    //评论人主键
    private Integer userId;

    //内容
    private String content;

    //第几楼
    private Integer floor;

    //是否首页展示
    private String isIndex;

    //文章主键
    private Integer giftArticleId;

    //是否子评论
    private String isSon;

    //是否子子回复
    private String isGrandson;

    //父主键
    private Integer fatherId;

    //回复评论主键
    private Integer replyId;

    //创建时间
    private Date createTime;

    public String getIsGrandson() {
        return isGrandson;
    }

    public void setIsGrandson(String isGrandson) {
        this.isGrandson = isGrandson;
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

    public String getIsIndex() {
        return isIndex;
    }

    public void setIsIndex(String isIndex) {
        this.isIndex = isIndex;
    }

    public Integer getGiftArticleId() {
        return giftArticleId;
    }

    public void setGiftArticleId(Integer giftArticleId) {
        this.giftArticleId = giftArticleId;
    }

    public String getIsSon() {
        return isSon;
    }

    public void setIsSon(String isSon) {
        this.isSon = isSon;
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", floor=" + floor +
                ", isIndex='" + isIndex + '\'' +
                ", giftArticleId=" + giftArticleId +
                ", isSon='" + isSon + '\'' +
                ", isGrandson='" + isGrandson + '\'' +
                ", fatherId=" + fatherId +
                ", replyId=" + replyId +
                ", createTime=" + createTime +
                '}';
    }
}
