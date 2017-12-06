package com.wanglu.movcat.service.impl;

import com.wanglu.movcat.model.Variety;
import com.wanglu.movcat.repository.VarietyRepository;
import com.wanglu.movcat.service.VarietyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VarietyServiceImpl implements VarietyService{

    @Autowired
    private VarietyRepository varietyRepository;

    @Override
    public List<Variety> getVariety() {
        return varietyRepository.findByIsSearch("Y");
    }

    @Override
    public Variety getVarietyDetail(Integer id) {
        return varietyRepository.findOne(id);
    }
}
