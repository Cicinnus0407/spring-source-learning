package com.cicinnus.spring.design.pattern.factory.simple;

import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * @author roger
 * @date 2018/9/22
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        try {
            //功能太强大,不可能存在
            Car car = CarFactory.build("Cadillac");
            System.out.println("获得一辆 : " + car.name());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
