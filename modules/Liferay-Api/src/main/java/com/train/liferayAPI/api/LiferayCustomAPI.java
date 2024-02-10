package com.train.liferayAPI.api;

/**
 * @author DEEPAK SINGH JANGRA
 */
public interface LiferayCustomAPI {
    public default void display(){
        System.out.println("Welcome to liferay API");
    }
    public void hello();
}