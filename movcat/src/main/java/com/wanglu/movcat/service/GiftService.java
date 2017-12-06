package com.wanglu.movcat.service;

import com.wanglu.movcat.model.Gift;

public interface GiftService {

    //获取礼品详情
    Gift findOne(Integer id);
}
