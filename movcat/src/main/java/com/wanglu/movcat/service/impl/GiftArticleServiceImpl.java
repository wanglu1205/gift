package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.model.GiftArticleVo;
import com.wanglu.movcat.model.Variety;
import com.wanglu.movcat.repository.GiftArticleRepository;
import com.wanglu.movcat.repository.VarietyRepository;
import com.wanglu.movcat.service.GiftArticleService;
import com.wanglu.movcat.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftArticleServiceImpl implements GiftArticleService{

    @Autowired
    private GiftArticleRepository giftArticleRepository;

    @Override
    public List<GiftArticle> findByIsShow() {
        return giftArticleRepository.findByIsShow("Y");
    }

    @Override
    public GiftArticle findOne(Integer id) {
        return giftArticleRepository.findOne(id);
    }
}
