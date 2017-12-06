package com.wanglu.movcat.repository;

import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.model.GiftArticleVo;
import com.wanglu.movcat.model.Variety;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftArticleRepository extends JpaRepository<GiftArticle, Integer>{

    List<GiftArticle> findByIsShow(String isShow);
}
