package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.JxjhDao;
import org.stary.campusoa.business.entity.Jxjh;
import org.stary.campusoa.business.service.JxjhService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class JxjhServiceImpl implements JxjhService {
    @Autowired
    private JxjhDao jxjhDao;
    
    @Override
    public Jxjh get(String id){
        return jxjhDao.get(id);
    }
    
    @Override
    public List<Jxjh> findList(Jxjh jxjh) {
        return jxjhDao.findList(jxjh);
    }
    
    @Override
    public List<Jxjh> findAllList() {
        return jxjhDao.findAllList();
    }
    
    @Override
    public int insert(Jxjh jxjh) {
        return jxjhDao.insert(jxjh);
    }
    
    @Override
    public int insertBatch(List<Jxjh> jxjhs){
        return jxjhDao.insertBatch(jxjhs);
    }
    
    @Override
    public int update(Jxjh jxjh) {
        return jxjhDao.update(jxjh);
    }
    
    @Override
    public int delete(Jxjh jxjh) {
        return jxjhDao.delete(jxjh);
    }

}
