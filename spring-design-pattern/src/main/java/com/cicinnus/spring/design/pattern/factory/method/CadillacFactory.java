package com.cicinnus.spring.design.pattern.factory.method;

import com.cicinnus.spring.design.pattern.factory.Cadillac;
import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * @author roger
 * @date 2018/9/22
 */
public class CadillacFactory implements IFactory {
    @Override
    public Car getCar() {
        return new Cadillac();
    }
}
