package com.wanglu.movcat.util.constant;

public enum CountEnum {

    commentCount("commentCount","评论数"),

    praiseCount("praiseCount","点赞数"),

    shareCount("shareCount","分享数"),

    totalBrowsingCount("totalBrowsingCount","总浏览数"),

    todayBrowsingCount("todayBrowsingCount","今日浏览数");

    private String value;

    private String name;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private CountEnum(String value, String name) {
        this.value = value;
        this.name = name;
    }
}
