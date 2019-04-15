package org.stary.campusoa.business.controller;

import com.bootdo.clouddocommon.annotation.Log;
import com.bootdo.clouddocommon.utils.PageUtils;
import com.bootdo.clouddocommon.utils.Query;
import com.bootdo.clouddocommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Zy;
import org.stary.campusoa.business.service.ZyService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/zy")
public class ZyController {
    @Autowired
    private ZyService zyService;

//    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
//    public Object list() {
//        List<Zy> zys = zyService.findAllList();
//        return zys;
//    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Zy zy = zyService.get(id);
        return zy;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Zy zy) {
        if (zyService.insert(zy) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Zy> zys) {
        if (zyService.insertBatch(zys) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Zy zy) {
        if (zyService.delete(zy) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Log("获取zy列表")
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<Map<String,Object>>  zys = zyService.findAllList();
        int total = zys.size();
        PageUtils pageUtil = new PageUtils(zys, total);
        return R.ok().put("page",pageUtil);
    }

    @PutMapping()
    R update(@RequestBody Zy zy){
        if(zyService.update(zy)>0){
            return R.ok();
        }
        return  R.error();
    }

    @PostMapping
    R save(@RequestBody Zy zy){
        return R.operate(zyService.insert(zy)>0);
    }

    @DeleteMapping()
    R remove(Long id){
        Zy zy = zyService.get(id.toString());
        if(zyService.delete(zy)>0){
            return R.ok();
        }
        return R.error();
    }

}
