package org.stary.campusoa.business.controller;

import com.bootdo.clouddocommon.annotation.Log;
import com.bootdo.clouddocommon.utils.PageUtils;
import com.bootdo.clouddocommon.utils.Query;
import com.bootdo.clouddocommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Teacher;
import org.stary.campusoa.business.service.TeacherService;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<Teacher> teachers = teacherService.findAllList();
        return teachers;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Teacher teacher = teacherService.get(id);
        return teacher;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Teacher teacher) {
        if (teacherService.insert(teacher) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Teacher> teachers) {
        if (teacherService.insertBatch(teachers) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Teacher teacher) {
        if (teacherService.delete(teacher) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Log("获取teacher列表")
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<Teacher> teachers = teacherService.findAllList();
        int total = teachers.size();
        PageUtils pageUtil = new PageUtils(teachers, total);
        return R.ok().put("page",pageUtil);
    }

    @PutMapping()
    R update(@RequestBody Teacher teacher){
        if(teacherService.update(teacher)>0){
            return R.ok();
        }
        return  R.error();
    }

    @PostMapping
    R save(@RequestBody Teacher teacher){
        return R.operate(teacherService.insert(teacher)>0);
    }

    @DeleteMapping()
    R remove(Long id){
        Teacher teacher = teacherService.get(id.toString());
        if(teacherService.delete(teacher)>0){
            return R.ok();
        }
        return R.error();
    }

}
