package com.javamultiplex.db.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Rohit Agarwal on 05/03/22 6:53 PM
 * @copyright www.javamultiplex.com
 */
@Configuration
@EntityScan(basePackages = "com.javamultiplex.db.entity")
@EnableJpaRepositories(basePackages = "com.javamultiplex.db.repository")
public class DBConfig {
}
