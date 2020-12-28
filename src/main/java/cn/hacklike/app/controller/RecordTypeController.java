package cn.hacklike.app.controller;

import cn.hacklike.app.entity.RecordType;
import cn.hacklike.app.feign.UserTenantFeign;
import cn.hacklike.app.service.RecordTypeService;
import cn.hacklike.common.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/recordType/")
public class RecordTypeController {

    @Autowired
    private RecordTypeService recordTypeService;

    @Autowired
    private UserTenantFeign userTenantFeign;

    @RequestMapping("hello")
    public String HelloRecord(){
        System.out.println("你好世界，我是记录类型管理模块！！");
        return "你好世界，我是记录类型管理模块！！";
    }



    @RequestMapping("selectList")
    public Response<List<RecordType>> selectListRecordType(){

        try {
            List<RecordType> recordTypes = this.recordTypeService.selectRecordType();
            return Response.newInstance(recordTypes);
        } catch (Exception e) {
            e.printStackTrace();
            return Response.newErrorInstance("查询记录类型失败",e);
        }

    }

    @RequestMapping("selectListFeign")
    public Response<String> selectListFeign(){

        try {
            String feign = this.userTenantFeign.selectTenantFeign();
            return Response.newInstance(feign);
        } catch (Exception e) {
            e.printStackTrace();
            return Response.newErrorInstance("查询记录类型失败",e);
        }

    }

}
