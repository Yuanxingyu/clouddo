package org.stary.campusoa.business.service;

import org.stary.campusoa.business.entity.Jxjh;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public interface JxjhService {

    public Jxjh get(String id);

    public List<Jxjh> findList(Jxjh jxjh);

    public List<Jxjh> findAllList();

    public int insert(Jxjh jxjh);

    public int insertBatch(List<Jxjh> jxjhs);

    public int update(Jxjh jxjh);

    public int delete(Jxjh jxjh);

}
