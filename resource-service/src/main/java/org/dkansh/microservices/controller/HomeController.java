package org.dkansh.microservices.controller;

import org.dkansh.microservices.service.HomeServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HomeController {

    @Autowired
    private HomeServiceFeign homeServiceFeign;

    @GetMapping(value = "/")
    public String home() {
        return homeServiceFeign.home();
    }
}
