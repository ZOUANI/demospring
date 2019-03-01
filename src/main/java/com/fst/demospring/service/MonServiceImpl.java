/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fst.demospring.service;

import com.fst.demospring.config.ConfigurationService;
import com.fst.demospring.dao.MonDao;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 *
 * @author YOUNES
 */
@Service
public class MonServiceImpl implements MonService {

    // private Logger LOGGER = LoggerFactory.getLogger(MonServiceImpl.class);
    final Logger logger = LoggerFactory.getLogger(MonServiceImpl.class);

    @Autowired
    private MonDao monDao;
    @Value("${serimp.hey}")
    private String messageConfig;
    @Autowired
    private ConfigurationService configurationService;

    @Scheduled(fixedDelay = 5000)
    public void executer() {
        System.out.println("Exécution de la tâche MaTache " + new Date());

    }

    public void afficher() {
        logger.debug("DEBUG MESSSAGEEEEE");
        logger.info("INFO MESSSAGEEEEE");
        logger.error("error message");
        logger.warn("warn message");

        // System.out.println(monDao.getMessage() + messageConfig);
        System.out.println("configggggggggg");
        System.out.println(configurationService);
    }

    public MonDao getMonDao() {
        return monDao;
    }

    public void setMonDao(MonDao monDao) {
        this.monDao = monDao;
    }

    public String getMessageConfig() {
        return messageConfig;
    }

    public void setMessageConfig(String messageConfig) {
        this.messageConfig = messageConfig;
    }

    public ConfigurationService getConfigurationService() {
        return configurationService;
    }

    public void setConfigurationService(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

}
