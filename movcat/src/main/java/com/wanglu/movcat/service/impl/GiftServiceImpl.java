package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.Gift;
import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.repository.GiftArticleRepository;
import com.wanglu.movcat.repository.GiftRepository;
import com.wanglu.movcat.service.GiftArticleService;
import com.wanglu.movcat.service.GiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftServiceImpl implements GiftService{

    @Autowired
    private GiftRepository giftRepository;


    @Override
    public Gift findOne(Integer id) {
        return giftRepository.findOne(id);
    }
}
