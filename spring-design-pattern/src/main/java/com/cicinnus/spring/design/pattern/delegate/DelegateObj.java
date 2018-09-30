package com.cicinnus.spring.design.pattern.delegate;

/**
 * @author roger
 * @date 2018/9/25
 */
public class DelegateObj {

    private final DelegatedObj delegatedObj;

    public DelegateObj() {
        delegatedObj = new DelegatedObj();
    }

    public void method1(){
        delegatedObj.method1();
    }

    public void method2(){
        delegatedObj.method2();
    }
}
