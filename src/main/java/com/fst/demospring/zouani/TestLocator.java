/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.demospring.zouani;

import com.fst.demospring.service.MonService;

/**
 *
 * @author YOUNES
 */
public class TestLocator {
    
    public void  sayHey(){
        MonService monService= Locator.getBean(MonService.class);
        System.out.println("before afficherrr");
        monService.afficher();
        System.out.println("after afficher");
    }
}
