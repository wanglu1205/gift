package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.Count;
import com.wanglu.movcat.service.CountService;
import com.wanglu.movcat.util.RedisTemplateUtil;
import com.wanglu.movcat.util.constant.CountEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService{

    @Autowired
    private RedisTemplate redisTemplate;


    @Override
    public Count get(String table, Integer id) {
        HashOperations data = RedisTemplateUtil.setRedisTemplate(redisTemplate).opsForHash();
        CountEnum[] counts = CountEnum.values();
        Count c = new Count();
        for (CountEnum count : counts) {
            String key = table+":"+id;
            if (data.get(key, count.getValue()) != null){
                if (CountEnum.commentCount.getValue().equals(count.getValue())){
                    c.setCommentCount(Integer.valueOf(String.valueOf(data.get(key, count.getValue()))));
                }else if (CountEnum.praiseCount.getValue().equals(count.getValue())){
                    c.setPraiseCount(Integer.valueOf(String.valueOf(data.get(key, count.getValue()))));
                }else if (CountEnum.shareCount.getValue().equals(count.getValue())){
                    c.setShareCount(Integer.valueOf(String.valueOf(data.get(key, count.getValue()))));
                }else if (CountEnum.todayBrowsingCount.getValue().equals(count.getValue())){
                    c.setTodayBrowsingCount(Integer.valueOf(String.valueOf(data.get(key, count.getValue()))));
                }else if (CountEnum.totalBrowsingCount.getValue().equals(count.getValue())){
                    c.setTotalBrowsingCount(Integer.valueOf(String.valueOf(data.get(key, count.getValue()))));
                }
            }else {
                c.setCommentCount(0);
                c.setPraiseCount(0);
                c.setShareCount(0);
                c.setTodayBrowsingCount(0);
                c.setTotalBrowsingCount(0);
            }
        }
        return c;
    }

    @Override
    public void incr(String table, Integer id, String field) {
        HashOperations data = RedisTemplateUtil.setRedisTemplate(redisTemplate).opsForHash();
        String key = table+":"+id;
        data.increment(key, field, 1);
    }


}
