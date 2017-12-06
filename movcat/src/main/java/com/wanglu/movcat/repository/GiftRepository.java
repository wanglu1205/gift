package com.wanglu.movcat.repository;

import com.wanglu.movcat.model.Gift;
import com.wanglu.movcat.model.GiftArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftRepository extends JpaRepository<Gift, Integer>{

}
