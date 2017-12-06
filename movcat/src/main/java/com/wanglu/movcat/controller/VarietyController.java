package com.wanglu.movcat.controller;

import com.wanglu.movcat.model.Variety;
import com.wanglu.movcat.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/variety")
public class VarietyController {

    @Autowired
    private VarietyService varietyService;

    /**
     * 获取猫品种列表
     * @return
     */
    @GetMapping("/getVariety")
    public List<Variety> getVariety() {
        return varietyService.getVariety();
    }

    /**
     * 获取猫详情
     * @return
     */
    @GetMapping("/getVarietyDetail")
    public String getVarietyDetail(Integer id,Model model) {
        model.addAttribute("variety", varietyService.getVarietyDetail(id));
        return "detail";
    }
}
