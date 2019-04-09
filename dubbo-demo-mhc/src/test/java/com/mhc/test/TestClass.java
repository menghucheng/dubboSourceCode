/**
 * @desc ：
 * @author ：tigermeng.
 * @date ：14:21 2019-04-09
 */
package com.mhc.test;

import org.junit.jupiter.api.Test;

/**
 *
 * @desc       ：
 * @author     ：tigermeng.
 * @date       ：14:21 2019-04-09
 *
 */
public class TestClass {


    @Test
    public void testPrimitive(){


        Class<Boolean> booleanClass = Boolean.class;
        Class<Void> voidClass = Void.class;
        Class byteClass = byte.class;
        System.out.println("是否为基础数据类型："+booleanClass.isPrimitive());
        System.out.println("是否为基础数据类型："+voidClass.isPrimitive());
        System.out.println("是否为基础数据类型："+byteClass.isPrimitive());
    }

}
