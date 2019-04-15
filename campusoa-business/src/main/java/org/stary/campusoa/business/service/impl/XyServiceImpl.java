package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.XyDao;
import org.stary.campusoa.business.entity.Xy;
import org.stary.campusoa.business.service.XyService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class XyServiceImpl implements XyService {
    @Autowired
    private XyDao xyDao;
    
    @Override
    public Xy get(String id){
        return xyDao.get(id);
    }
    
    @Override
    public List<Xy> findList(Xy xy) {
        return xyDao.findList(xy);
    }
    
    @Override
    public List<Xy> findAllList() {
        return xyDao.findAllList();
    }
    
    @Override
    public int insert(Xy xy) {
        return xyDao.insert(xy);
    }
    
    @Override
    public int insertBatch(List<Xy> xys){
        return xyDao.insertBatch(xys);
    }
    
    @Override
    public int update(Xy xy) {
        return xyDao.update(xy);
    }
    
    @Override
    public int delete(Xy xy) {
        return xyDao.delete(xy);
    }

}
