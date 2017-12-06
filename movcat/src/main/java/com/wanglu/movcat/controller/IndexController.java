package com.wanglu.movcat.controller;

import com.wanglu.movcat.model.Comment;
import com.wanglu.movcat.model.GiftArticle;
import com.wanglu.movcat.model.GiftArticleVo;
import com.wanglu.movcat.model.User;
import com.wanglu.movcat.service.CommentService;
import com.wanglu.movcat.service.GiftArticleService;
import com.wanglu.movcat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private GiftArticleService giftArticleService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private UserService userService;

    /**
     * 首页
     * @return
     */
    @GetMapping("/")
    public String index(Model model) {
        List<GiftArticle> giftArticleList = giftArticleService.findByIsShow();
        List<GiftArticleVo> giftArticleVoList = new ArrayList<>();
        for (GiftArticle giftArticle:giftArticleList) {
            Integer id = giftArticle.getId();
            Comment indexComment = commentService.findFirstByIsIndexAndAndGiftArticleId(id);
            GiftArticleVo giftArticleVo = null;
            if (indexComment != null){
                User user = userService.findOne(indexComment.getUserId());
                giftArticleVo = new GiftArticleVo(giftArticle.getId(), giftArticle.getImgUrl(),
                        giftArticle.getTitle(), 14, 42, 134,
                        user.getId(), user.getName(), user.getImgUrl(), indexComment.getContent());
            }else {
                giftArticleVo = new GiftArticleVo(giftArticle.getId(), giftArticle.getImgUrl(),
                        giftArticle.getTitle(), 14, 42, 134);
            }

            giftArticleVoList.add(giftArticleVo);
        }
        model.addAttribute("giftArticleVoList", giftArticleVoList);
        return "/index";
    }

    /**
     * 首页
     * @return
     */
    @GetMapping("/detail")
    public String detail(Model model) {
        return "/detail";
    }

}
