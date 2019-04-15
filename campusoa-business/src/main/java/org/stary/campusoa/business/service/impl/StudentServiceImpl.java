package org.stary.campusoa.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stary.campusoa.business.dao.StudentDao;
import org.stary.campusoa.business.entity.Student;
import org.stary.campusoa.business.service.StudentService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    
    @Override
    public Student get(String id){
        return studentDao.get(id);
    }
    
    @Override
    public List<Student> findList(Student student) {
        return studentDao.findList(student);
    }
    
    @Override
    public List<Student> findAllList() {
        return studentDao.findAllList();
    }
    
    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }
    
    @Override
    public int insertBatch(List<Student> students){
        return studentDao.insertBatch(students);
    }
    
    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }
    
    @Override
    public int delete(Student student) {
        return studentDao.delete(student);
    }

}
