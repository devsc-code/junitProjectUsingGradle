package com.surajit.testclasses;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTest {


    @Test
    @Timeout(value=100,unit= TimeUnit.MILLISECONDS)
    public void pTest2(){
        System.out.println("Hi there");//test should pass
    }
    @Test
    @Timeout(value=10,unit= TimeUnit.MILLISECONDS)
    public void pTest1(){
        int i=0;
        while(i<90000000)
        {
            i++;
            int j=0;
            while(j<900000099)
            {
                j++;
            }
        }
    }



}
