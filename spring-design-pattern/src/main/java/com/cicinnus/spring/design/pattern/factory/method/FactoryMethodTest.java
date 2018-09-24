package com.cicinnus.spring.design.pattern.factory.method;

import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * @author roger
 * @date 2018/9/22
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        IFactory factory = new CadillacFactory();
        Car car = factory.getCar();
        System.out.println("生产" + car.name());
    }
}
