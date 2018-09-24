package com.cicinnus.spring.design.pattern.factory.method;

import com.cicinnus.spring.design.pattern.factory.Buick;
import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * @author roger
 * @date 2018/9/22
 */
public class BuickFactory implements IFactory {
    @Override
    public Car getCar() {
        return new Buick();
    }
}
