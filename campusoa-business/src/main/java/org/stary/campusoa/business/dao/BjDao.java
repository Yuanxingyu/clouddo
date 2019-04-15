package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Bj;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-13
 */
@Mapper
public interface BjDao {

    public Bj get(String id);

    public List<Map<String,Object>> findList(Bj bj);

    public List<Map<String,Object>> findAllList();

    public int insert(Bj bj);

    public int insertBatch(List<Bj> bjs);

    public int update(Bj bj);

    public int delete(Bj bj);

}