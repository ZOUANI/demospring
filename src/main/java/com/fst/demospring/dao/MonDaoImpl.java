/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.demospring.dao;

import org.springframework.stereotype.Repository;

/**
 *
 * @author YOUNES
 */
@Repository
public class MonDaoImpl implements MonDao {

    @Override
    public String getMessage() {

        return "Bonjour";

    }

}
