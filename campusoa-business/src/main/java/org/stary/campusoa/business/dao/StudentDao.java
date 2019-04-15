package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Student;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Mapper
public interface StudentDao {

    public Student get(String id);

    public List<Student> findList(Student student);

    public List<Student> findAllList();

    public int insert(Student student);

    public int insertBatch(List<Student> students);

    public int update(Student student);

    public int delete(Student student);

}