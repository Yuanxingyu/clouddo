package org.stary.campusoa.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Student;
import org.stary.campusoa.business.service.StudentService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<Student> students = studentService.findAllList();
        return students;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Student student = studentService.get(id);
        return student;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Student student) {
        if (studentService.insert(student) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Student> students) {
        if (studentService.insertBatch(students) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody Student student) {
        if (studentService.update(student) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Student student) {
        if (studentService.delete(student) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
