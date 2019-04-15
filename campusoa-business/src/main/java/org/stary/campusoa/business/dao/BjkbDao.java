package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Bjkb;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Mapper
public interface BjkbDao {

    public Bjkb get(String id);

    public List<Bjkb> findList(Bjkb bjkb);

    public List<Bjkb> findAllList();

    public int insert(Bjkb bjkb);

    public int insertBatch(List<Bjkb> bjkbs);

    public int update(Bjkb bjkb);

    public int delete(Bjkb bjkb);

}