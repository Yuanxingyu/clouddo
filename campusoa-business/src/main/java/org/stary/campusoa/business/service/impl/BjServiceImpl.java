package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.BjDao;
import org.stary.campusoa.business.entity.Bj;
import org.stary.campusoa.business.service.BjService;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-13
 */
@Service
public class BjServiceImpl implements BjService {
    @Autowired
    private BjDao bjDao;
    
    @Override
    public Bj get(String id){
        return bjDao.get(id);
    }
    
    @Override
    public List<Map<String,Object>> findList(Bj bj) {
        return bjDao.findList(bj);
    }
    
    @Override
    public List<Map<String,Object>> findAllList() {
        return bjDao.findAllList();
    }
    
    @Override
    public int insert(Bj bj) {
        return bjDao.insert(bj);
    }
    
    @Override
    public int insertBatch(List<Bj> bjs){
        return bjDao.insertBatch(bjs);
    }
    
    @Override
    public int update(Bj bj) {
        return bjDao.update(bj);
    }
    
    @Override
    public int delete(Bj bj) {
        return bjDao.delete(bj);
    }

}
