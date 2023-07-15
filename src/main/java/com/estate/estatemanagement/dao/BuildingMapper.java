package com.estate.estatemanagement.dao;

import com.estate.estatemanagement.domain.Building;
import com.estate.estatemanagement.domain.Community;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface BuildingMapper extends Mapper<Building> {
}
