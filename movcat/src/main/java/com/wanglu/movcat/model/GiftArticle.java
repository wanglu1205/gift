package com.wanglu.movcat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class GiftArticle {

    //主键
    @Id
    @GeneratedValue
    private Integer id;

    //名称
    private String title;

    //主图
    private String imgUrl;

    //用户主键
    private Integer userId;

    //礼品主键
    private Integer giftId;

    //详情
    private String details;

    //是否首页展示
    private String isShow;

    //创建时间
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGiftId() {
        return giftId;
    }

    public void setGiftId(Integer giftId) {
        this.giftId = giftId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String inShow) {
        this.isShow = inShow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GiftArticle{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", userId=" + userId +
                ", giftId=" + giftId +
                ", details='" + details + '\'' +
                ", isShow='" + isShow + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
