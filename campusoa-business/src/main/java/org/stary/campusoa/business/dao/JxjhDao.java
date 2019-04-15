package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Jxjh;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Mapper
public interface JxjhDao {

    public Jxjh get(String id);

    public List<Jxjh> findList(Jxjh jxjh);

    public List<Jxjh> findAllList();

    public int insert(Jxjh jxjh);

    public int insertBatch(List<Jxjh> jxjhs);

    public int update(Jxjh jxjh);

    public int delete(Jxjh jxjh);

}