package org.stary.campusoa.business.controller;

import com.bootdo.clouddocommon.annotation.Log;
import com.bootdo.clouddocommon.utils.PageUtils;
import com.bootdo.clouddocommon.utils.Query;
import com.bootdo.clouddocommon.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.stary.campusoa.business.entity.Jxjh;
import org.stary.campusoa.business.service.JxjhService;

import java.util.List;
import java.util.Map;

/**
 * Author Stary Yuan
 * Date  2019-04-14
 */
@RestController
@RequestMapping(value = "/jxjh")
public class JxjhController {
    @Autowired
    private JxjhService jxjhService;

//    @RequestMapping(value = {"/list", ""}, method = RequestMethod.GET)
//    public Object list() {
//        List<Jxjh> jxjhs = jxjhService.findAllList();
//        return jxjhs;
//    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public Object get(@RequestParam String id) {
        Jxjh jxjh = jxjhService.get(id);
        return jxjh;
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestBody Jxjh jxjh) {
        if (jxjhService.insert(jxjh) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @RequestMapping(value = "/insertBatch", method = RequestMethod.POST)
    public String insertBatch(@RequestBody List<Jxjh> jxjhs) {
        if (jxjhService.insertBatch(jxjhs) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public String update(@RequestBody Jxjh jxjh) {
//        if (jxjhService.update(jxjh) > 0) {
//            return "success";
//        } else {
//            return "failed";
//        }
//    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Jxjh jxjh) {
        if (jxjhService.delete(jxjh) > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Log("获取教学计划列表")
    @GetMapping()
    R listByPage(@RequestParam Map<String, Object> params) {
        Query query = new Query(params);
        List<Jxjh> jsjhs = jxjhService.findAllList();
        int total = jsjhs.size();
        PageUtils pageUtil = new PageUtils(jsjhs, total);
        return R.ok().put("page",pageUtil);
    }

    @PutMapping()
    R update(@RequestBody Jxjh jxjh){
        if(jxjhService.update(jxjh)>0){
            return R.ok();
        }
        return  R.error();
    }
    @PostMapping
    R save(@RequestBody Jxjh jxjh){
        return R.operate(jxjhService.insert(jxjh)>0);
    }

    @DeleteMapping()
    R remove(Long id){
        Jxjh jxjh = jxjhService.get(id.toString());
        if(jxjhService.delete(jxjh)>0){
            return R.ok();
        }
        return R.error();
    }

}
