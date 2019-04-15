package org.stary.campusoa.business.service;

import org.stary.campusoa.business.entity.Bj;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-13
 */
public interface BjService {

    public Bj get(String id);

    public List<Map<String,Object>> findList(Bj bj);

    public List<Map<String,Object>> findAllList();

    public int insert(Bj bj);

    public int insertBatch(List<Bj> bjs);

    public int update(Bj bj);

    public int delete(Bj bj);

}
