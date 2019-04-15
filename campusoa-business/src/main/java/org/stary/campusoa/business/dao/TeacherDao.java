package org.stary.campusoa.business.dao;

import org.apache.ibatis.annotations.Mapper;
import org.stary.campusoa.business.entity.Teacher;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@Mapper
public interface TeacherDao {

    public Teacher get(String id);

    public List<Teacher> findList(Teacher teacher);

    public List<Teacher> findAllList();

    public int insert(Teacher teacher);

    public int insertBatch(List<Teacher> teachers);

    public int update(Teacher teacher);

    public int delete(Teacher teacher);

}