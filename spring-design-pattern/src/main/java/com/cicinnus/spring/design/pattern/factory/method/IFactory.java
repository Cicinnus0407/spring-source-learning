package com.cicinnus.spring.design.pattern.factory.method;

import com.cicinnus.spring.design.pattern.factory.Car;

/**
 * 定义所有工程的执行表型
 * @author roger
 * @date 2018/9/22
 */
public interface IFactory {

    Car getCar();
}
