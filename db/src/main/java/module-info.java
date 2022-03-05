/**
 * @author Rohit Agarwal on 04/03/22 11:31 PM
 * @copyright www.javamultiplex.com
 */module com.javamultiplex.modules.db {
     requires spring.beans;
     requires java.annotation;
     requires spring.context;
     requires spring.data.commons;
     requires spring.data.jpa;
     requires lombok;
     requires java.persistence;
     requires spring.boot.autoconfigure;
     exports com.javamultiplex.db.entity;
     exports com.javamultiplex.db.repository;
     exports com.javamultiplex.db.service;
}