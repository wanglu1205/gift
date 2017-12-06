package com.wanglu.movcat.service;

import com.wanglu.movcat.model.Comment;
import com.wanglu.movcat.model.GiftArticle;

import java.util.List;

public interface CommentService {

    //获取一条首页展示
    Comment findFirstByIsIndexAndAndGiftArticleId(Integer giftArticleId);

    //获取某个文章的评论列表
    public List<Comment> findAll(Integer giftArticleId);

    //获取子论列表
    List<Comment> findByIsSonAndIsGrandsonAndGiftArticleId(String isSon, String isGrandson, Integer giftArticleId);

    //获取子评论列表
    List<Comment> findByFatherIdAndIsSon(Integer fatherId);

    //获取子子评论列表
    List<Comment> findByFatherIdAndIsGrandson(Integer fatherId);

    public Comment findOne(Integer id);

}
