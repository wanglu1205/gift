package com.wanglu.movcat.model;

import java.util.Date;

//验证码
public class IdentifyingCode {

    private String tel;

    private String code;

    private Date createTime;

    public IdentifyingCode() {
    }

    public IdentifyingCode(String tel, String code, Date createTime) {
        this.tel = tel;
        this.code = code;
        this.createTime = createTime;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
