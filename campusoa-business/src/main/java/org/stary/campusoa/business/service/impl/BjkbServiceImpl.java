package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.BjkbDao;
import org.stary.campusoa.business.entity.Bjkb;
import org.stary.campusoa.business.service.BjkbService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class BjkbServiceImpl implements BjkbService {
    @Autowired
    private BjkbDao bjkbDao;
    
    @Override
    public Bjkb get(String id){
        return bjkbDao.get(id);
    }
    
    @Override
    public List<Bjkb> findList(Bjkb bjkb) {
        return bjkbDao.findList(bjkb);
    }
    
    @Override
    public List<Bjkb> findAllList() {
        return bjkbDao.findAllList();
    }
    
    @Override
    public int insert(Bjkb bjkb) {
        return bjkbDao.insert(bjkb);
    }
    
    @Override
    public int insertBatch(List<Bjkb> bjkbs){
        return bjkbDao.insertBatch(bjkbs);
    }
    
    @Override
    public int update(Bjkb bjkb) {
        return bjkbDao.update(bjkb);
    }
    
    @Override
    public int delete(Bjkb bjkb) {
        return bjkbDao.delete(bjkb);
    }

}
