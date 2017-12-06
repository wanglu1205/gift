package com.wanglu.movcat.repository;

import com.wanglu.movcat.model.Variety;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VarietyRepository extends JpaRepository<Variety, Integer>{

    List<Variety> findByIsSearch(String isSearch);
}
