package com.christ.formation.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christ IKONDO
 */
    @SpringBootApplication
@EnableDiscoveryClient
public class GatewayServiceApplication {

   public static void main(String[] args) {
      SpringApplication.run(GatewayServiceApplication.class, args);
   }

}
