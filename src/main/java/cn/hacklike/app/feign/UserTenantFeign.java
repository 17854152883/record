package cn.hacklike.app.feign;

import cn.hacklike.common.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "user-tenant")
public interface UserTenantFeign {

    @RequestMapping("/tenant/selectListFeign")
    public String selectTenantFeign();

}
