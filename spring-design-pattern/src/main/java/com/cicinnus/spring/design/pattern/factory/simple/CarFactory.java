package com.cicinnus.spring.design.pattern.factory.simple;

import com.cicinnus.spring.design.pattern.factory.Audi;
import com.cicinnus.spring.design.pattern.factory.Buick;
import com.cicinnus.spring.design.pattern.factory.Cadillac;
import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * @author roger
 * @date 2018/9/22
 */
public class CarFactory {

    /**
     * 生产汽车
     *
     * @param carName
     * @return
     */
    public static Car build(String carName) throws ClassNotFoundException {
        String aCase = carName.toUpperCase();
        switch (aCase) {
            case "CADILLAC":
                return new Cadillac();
            case "AUDI":
                return new Audi();
            case "BUICK":
                return new Buick();
            default:
                throw new ClassNotFoundException("不存在的车");
        }
    }
}
