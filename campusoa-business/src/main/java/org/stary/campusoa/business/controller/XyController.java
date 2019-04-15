package org.stary.campusoa.business.controller;

import com.bootdo.clouddocommon.annotation.Log;
import com.bootdo.clouddocommon.utils.PageUtils;
import com.bootdo.clouddocommon.utils.Query;
import com.bootdo.clouddocommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Xy;
import org.stary.campusoa.business.service.XyService;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/xy")
public class XyController {
    @Autowired
    private XyService xyService;

//    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
//    public Object list() {
//        List<Xy> xys = xyService.findAllList();
//        return xys;
//    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Xy xy = xyService.get(id);
        return xy;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Xy xy) {
        if (xyService.insert(xy) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Xy> xys) {
        if (xyService.insertBatch(xys) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Xy xy) {
        if (xyService.delete(xy) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Log("获取xy列表")
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<Xy> xys = xyService.findAllList();
        int total = xys.size();
        PageUtils pageUtil = new PageUtils(xys, total);
        return R.ok().put("page",pageUtil);
    }

    @PutMapping()
    R update(@RequestBody Xy xy){
        if(xyService.update(xy)>0){
            return R.ok();
        }
        return  R.error();
    }

    @PostMapping
    R save(@RequestBody Xy xy){
        return R.operate(xyService.insert(xy)>0);
    }

    @DeleteMapping()
    R remove(Long id){
        Xy xy = xyService.get(id.toString());
        if(xyService.delete(xy)>0){
            return R.ok();
        }
        return R.error();
    }

}
