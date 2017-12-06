package com.wanglu.movcat.service;

import com.wanglu.movcat.model.Count;

public interface CountService {

    //获取统计数
    Count get(String table, Integer id);

    //统计数+1
    void incr(String table, Integer id, String field);
}
