/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christ.formation.securityservice;

import com.cagecfi.security.SecurityServiceApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 *
 * @author christ IKONDO
 */
@SpringBootApplication
@EnableCaching
public class SecurityApplication {
     public static void main(String[] args) {
            SpringApplication.run(SecurityServiceApplication.class, args);
        }

}
