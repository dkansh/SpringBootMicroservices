package org.dkansh.microservices.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface HomeServiceFeign {

    @GetMapping("/")
    String home();
}
