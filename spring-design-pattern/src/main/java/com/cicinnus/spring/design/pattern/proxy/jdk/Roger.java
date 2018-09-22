package com.cicinnus.spring.design.pattern.proxy.jdk;

/**
 * Roger租客
 *
 * @author roger
 * @date 2018/9/22
 */
public class Roger implements Renter {

    private String name;
    private Double budget;


    public Roger(String name, Double budget) {
        this.name = name;
        this.budget = budget;
    }

    @Override
    public void rentHouse() {
        System.out.println("两押一付");
        System.out.println("最好有电梯");
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double budget() {
        return budget;
    }

}
