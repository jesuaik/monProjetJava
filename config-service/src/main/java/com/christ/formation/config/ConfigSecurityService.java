/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * @author christ IKONDO
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigSecurityService {
    public static void main(String[] args) {
    SpringApplication.run(ConfigSecurityService.class, args);
  }
}
