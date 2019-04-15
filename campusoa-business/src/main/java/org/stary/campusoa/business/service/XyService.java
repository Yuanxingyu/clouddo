package org.stary.campusoa.business.service;

import org.stary.campusoa.business.entity.Xy;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public interface XyService {

    public Xy get(String id);

    public List<Xy> findList(Xy xy);

    public List<Xy> findAllList();

    public int insert(Xy xy);

    public int insertBatch(List<Xy> xys);

    public int update(Xy xy);

    public int delete(Xy xy);

}
