package com.baserouter.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.baserouter")
public class BaseRouterStartApp
{
    public static void main(String args[])
    {
        SpringApplication.run(BaseRouterStartApp.class,args);
    }
}
