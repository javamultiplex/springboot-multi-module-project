package com.javamultiplex.application.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rohit Agarwal on 05/03/22 6:40 PM
 * @copyright www.javamultiplex.com
 */
@Configuration
@ComponentScan(basePackages = {"com.javamultiplex.db","com.javamultiplex.web"})
public class AppConfig {
}
