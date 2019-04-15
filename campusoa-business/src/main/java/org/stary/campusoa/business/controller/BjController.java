package org.stary.campusoa.business.controller;

import com.bootdo.clouddocommon.annotation.Log;
import com.bootdo.clouddocommon.utils.PageUtils;
import com.bootdo.clouddocommon.utils.Query;
import com.bootdo.clouddocommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Bj;
import org.stary.campusoa.business.entity.Jxjh;
import org.stary.campusoa.business.service.BjService;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-13
 */
@RestController
@RequestMapping(value = "/bj")
public class BjController {
    @Autowired
    private BjService bjService;

//    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
//    public Object list() {
//        List<Bj> bjs = bjService.findAllList();
//        return bjs;
//    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Bj bj = bjService.get(id);
        return bj;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Bj bj) {
        if (bjService.insert(bj) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Bj> bjs) {
        if (bjService.insertBatch(bjs) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String update(@RequestBody Bj bj) {
//        if (bjService.update(bj) > 0) {
//            return "success";
//        } else {
//            return "failed";
//        }
//    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Bj bj) {
        if (bjService.delete(bj) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Log("获取bj列表")
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<Map<String,Object>> bjs = bjService.findAllList();
        int total = bjs.size();
        PageUtils pageUtil = new PageUtils(bjs, total);
        return R.ok().put("page",pageUtil);
    }

    @PutMapping()
    R update(@RequestBody Bj bj){
        if(bjService.update(bj)>0){
            return R.ok();
        }
        return  R.error();
    }
    @PostMapping
    R save(@RequestBody Bj bj){
        return R.operate(bjService.insert(bj)>0);
    }

    @DeleteMapping()
    R remove(Long id){
        Bj bj = bjService.get(id.toString());
        if(bjService.delete(bj)>0){
            return R.ok();
        }
        return R.error();
    }

}
