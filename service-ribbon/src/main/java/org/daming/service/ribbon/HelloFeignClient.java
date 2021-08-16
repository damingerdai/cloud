package org.daming.service.ribbon;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient( name = "service-hi", configuration = FeignLogConfiguration.class)
public interface HelloFeignClient {

    @RequestMapping("/hi")
    String hi(@RequestParam(value = "name", defaultValue = "forezp") String name);
}
