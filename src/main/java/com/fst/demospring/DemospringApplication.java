package com.fst.demospring;

import com.fst.demospring.service.MonService;
import com.fst.demospring.service.MonServiceImpl;
import com.fst.demospring.zouani.Locator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemospringApplication {

    public static void main(String[] args) {
        System.out.println("hana runnit context");
        ConfigurableApplicationContext context = SpringApplication.run(DemospringApplication.class, args);
        Locator.setContext(context);
        // TestLocator testLocator= new TestLocator();
        // testLocator.sayHey();
//        if (context == null) {
//            System.out.println("context rah nullllllllll");
//        } else {
//        MonService monService = context.getBean(MonServiceImpl.class);
//        monService.afficher();
//        }
    }

}
