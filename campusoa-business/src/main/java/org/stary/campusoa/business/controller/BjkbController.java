package org.stary.campusoa.business.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Bjkb;
import org.stary.campusoa.business.service.BjkbService;

import java.util.List;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/bjkb")
public class BjkbController {
    @Autowired
    private BjkbService bjkbService;

    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
    public Object list() {
        List<Bjkb> bjkbs = bjkbService.findAllList();
        return bjkbs;
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Bjkb bjkb = bjkbService.get(id);
        return bjkb;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Bjkb bjkb) {
        if (bjkbService.insert(bjkb) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Bjkb> bjkbs) {
        if (bjkbService.insertBatch(bjkbs) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestBody Bjkb bjkb) {
        if (bjkbService.update(bjkb) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Bjkb bjkb) {
        if (bjkbService.delete(bjkb) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

}
