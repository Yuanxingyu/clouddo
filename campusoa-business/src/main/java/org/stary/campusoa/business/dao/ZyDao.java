package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Zy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Mapper
public interface ZyDao {

    public Zy get(String id);

    public List<Map<String,Object>>  findList(Zy zy);

    public List<Map<String,Object>> findAllList();

    public int insert(Zy zy);

    public int insertBatch(List<Zy> zys);

    public int update(Zy zy);

    public int delete(Zy zy);

}