package com.surajit.testclasses;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;


public class ExceptionTest
{
    @BeforeAll
    public static void beforeAllMethod()
    {
        System.out.println("in before all");

    }
    @BeforeEach
    public void beforeMethod()
    {
        System.out.println("in before each");
    }
    @Test
    public void ExceptionTest1()
    {
        Exception ob= assertThrows(MyException.class,()-> {
            throw new MyException();
        });

        System.out.println(ob.getMessage());// in console a customised message should be printed and
    }
    @Test
    public void test2()
    {
       System.out.println("In test2");
    }
    @AfterAll
    public static  void afterAllMethod()
    {
        System.out.println("in after all");

    }
    @AfterEach
    public void afterMethod()
    {
        System.out.println("in after each");
    }
}
