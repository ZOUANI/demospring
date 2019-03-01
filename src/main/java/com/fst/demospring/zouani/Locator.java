/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.demospring.zouani;

import org.springframework.context.ConfigurableApplicationContext;

/**
 *
 * @author YOUNES
 */
public class Locator {

    private static ConfigurableApplicationContext context;

    public static <T> T getBean(Class<T> entityType){
        return context.getBean(entityType);
    }

    public static ConfigurableApplicationContext getContext() {
        return context;
    }

    public static void setContext(ConfigurableApplicationContext context) {
        Locator.context = context;
    }

}
