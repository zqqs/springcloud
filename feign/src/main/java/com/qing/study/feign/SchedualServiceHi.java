package com.qing.study.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @author: qing.zhang
 * @date: 2018-06-01
 */
@FeignClient(value = "eureka-client")//指定调用那个服务
//@Component
interface SchedualServiceHi {
;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientONe(@RequestParam(value = "name")String name);
}
