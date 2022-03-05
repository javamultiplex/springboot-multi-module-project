/**
 * @author Rohit Agarwal on 05/03/22 3:56 PM
 * @copyright www.javamultiplex.com
 */
module com.javamultiplex.modules.web {
    requires spring.beans;
    requires spring.web;
    requires com.javamultiplex.modules.db;
    exports com.javamultiplex.web.controller;
}