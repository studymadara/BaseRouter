package com.baserouter.route;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "baseRoute")
public class BaseRoute
{
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/adminPortal")
    public String getPortalInstance()
    {
        return restTemplate.getForObject("http://baseRoute/adminPortal/home",String.class);
    }
}
