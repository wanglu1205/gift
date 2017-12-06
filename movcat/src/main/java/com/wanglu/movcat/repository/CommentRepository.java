package com.wanglu.movcat.repository;

import com.wanglu.movcat.model.Comment;
import com.wanglu.movcat.model.GiftArticle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

    Comment findFirstByIsIndexAndAndGiftArticleId(String IsIndex, Integer giftArticleId);

    List<Comment> findByIsSonAndIsGrandsonAndGiftArticleId(String isSon, String isGrandson, Integer giftArticleId);

    List<Comment> findByFatherIdAndIsSon(Integer fatherId, String isSon);

    List<Comment> findByFatherIdAndIsGrandson(Integer fatherId, String isGrandson);
}
