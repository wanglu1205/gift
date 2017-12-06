package com.wanglu.movcat.service;

import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.model.GiftArticleVo;
import com.wanglu.movcat.model.Variety;

import java.util.List;

public interface GiftArticleService {

    //获取文章列表
    List<GiftArticle> findByIsShow();

    //获取文章详情
    GiftArticle findOne(Integer id);
}
