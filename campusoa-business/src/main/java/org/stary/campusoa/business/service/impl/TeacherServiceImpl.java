package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.TeacherDao;
import org.stary.campusoa.business.entity.Teacher;
import org.stary.campusoa.business.service.TeacherService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;
    
    @Override
    public Teacher get(String id){
        return teacherDao.get(id);
    }
    
    @Override
    public List<Teacher> findList(Teacher teacher) {
        return teacherDao.findList(teacher);
    }
    
    @Override
    public List<Teacher> findAllList() {
        return teacherDao.findAllList();
    }
    
    @Override
    public int insert(Teacher teacher) {
        return teacherDao.insert(teacher);
    }
    
    @Override
    public int insertBatch(List<Teacher> teachers){
        return teacherDao.insertBatch(teachers);
    }
    
    @Override
    public int update(Teacher teacher) {
        return teacherDao.update(teacher);
    }
    
    @Override
    public int delete(Teacher teacher) {
        return teacherDao.delete(teacher);
    }

}
