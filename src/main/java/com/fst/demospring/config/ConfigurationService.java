/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.demospring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author YOUNES
 */
@Component
@ConfigurationProperties("myservice.domain")
public class ConfigurationService {

    private String myConstant1;
    private String myConstant2;
    private Double myNumber1;

    public String getMyConstant1() {
        return myConstant1;
    }

    public void setMyConstant1(String myConstant1) {
        this.myConstant1 = myConstant1;
    }

    public String getMyConstant2() {
        return myConstant2;
    }

    public void setMyConstant2(String myConstant2) {
        this.myConstant2 = myConstant2;
    }

    public Double getMyNumber1() {
        return myNumber1;
    }

    public void setMyNumber1(Double myNumber1) {
        this.myNumber1 = myNumber1;
    }

    @Override
    public String toString() {
        return "ConfigurationService{" + "myConstant1=" + myConstant1 + ", myConstant2=" + myConstant2 + ", myNumber1=" + myNumber1 + '}';
    }

}
