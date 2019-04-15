package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.ZyDao;
import org.stary.campusoa.business.entity.Zy;
import org.stary.campusoa.business.service.ZyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class ZyServiceImpl implements ZyService {
    @Autowired
    private ZyDao zyDao;
    
    @Override
    public Zy get(String id){
        return zyDao.get(id);
    }
    
    @Override
    public List<Map<String,Object>>  findList(Zy zy) {
        return zyDao.findList(zy);
    }
    
    @Override
    public List<Map<String,Object>>  findAllList() {
        return zyDao.findAllList();
    }
    
    @Override
    public int insert(Zy zy) {
        return zyDao.insert(zy);
    }
    
    @Override
    public int insertBatch(List<Zy> zys){
        return zyDao.insertBatch(zys);
    }
    
    @Override
    public int update(Zy zy) {
        return zyDao.update(zy);
    }
    
    @Override
    public int delete(Zy zy) {
        return zyDao.delete(zy);
    }

}
