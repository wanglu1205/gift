package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.Comment;
import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.repository.CommentRepository;
import com.wanglu.movcat.repository.GiftArticleRepository;
import com.wanglu.movcat.service.CommentService;
import com.wanglu.movcat.service.GiftArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    private CommentRepository commentRepository;


    @Override
    public Comment findFirstByIsIndexAndAndGiftArticleId(Integer giftArticleId) {
        return commentRepository.findFirstByIsIndexAndAndGiftArticleId("Y", giftArticleId);
    }

    @Override
    public List<Comment> findAll(Integer giftArticleId) {
        return commentRepository.findAll();
    }

    @Override
    public List<Comment> findByIsSonAndIsGrandsonAndGiftArticleId(String isSon, String isGrandson, Integer giftArticleId) {
        return commentRepository.findByIsSonAndIsGrandsonAndGiftArticleId(isSon, isGrandson, giftArticleId);
    }

    @Override
    public List<Comment> findByFatherIdAndIsSon(Integer fatherId) {
        return commentRepository.findByFatherIdAndIsSon(fatherId, "Y");
    }

    @Override
    public List<Comment> findByFatherIdAndIsGrandson(Integer fatherId) {
        return commentRepository.findByFatherIdAndIsGrandson(fatherId, "Y");
    }

    @Override
    public Comment findOne(Integer id) {
        return commentRepository.findOne(id);
    }
}
