package com.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.order.entity.SeriesEntity;

@Repository
public interface SeriesRepository  extends JpaRepository<SeriesEntity, Integer>{

}
