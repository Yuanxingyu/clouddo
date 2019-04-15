package org.stary.campusoa.business.service;

import org.stary.campusoa.business.entity.Bjkb;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
public interface BjkbService {

    public Bjkb get(String id);

    public List<Bjkb> findList(Bjkb bjkb);

    public List<Bjkb> findAllList();

    public int insert(Bjkb bjkb);

    public int insertBatch(List<Bjkb> bjkbs);

    public int update(Bjkb bjkb);

    public int delete(Bjkb bjkb);

}
