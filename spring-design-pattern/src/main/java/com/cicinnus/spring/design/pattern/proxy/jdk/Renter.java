package com.cicinnus.spring.design.pattern.proxy.jdk;

/**
 * 被代理人,租客
 *
 * @author roger
 * @date 2018/9/22
 */
public interface Renter {
    /**
     * 租房功能
     */
    void rentHouse();

    String getName();

    Double budget();

}
