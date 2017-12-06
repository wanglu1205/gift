package com.wanglu.movcat.service;

import com.wanglu.movcat.model.Variety;

import java.util.List;

public interface VarietyService {

    //获取猫品种列表
    List<Variety> getVariety();

    //获取猫详情
    Variety getVarietyDetail(Integer id);
}
