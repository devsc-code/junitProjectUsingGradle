package com.surajit.testclasses;



import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class CompareArrays {
    int arr1[] = new int[]{1,2,3};
    int arr2[] = new int[]{1,2,3};
    int arr3[] = new int[]{1,3,2};
   @Test
    public void testArraysAreEqual1()
    {
        assertArrayEquals(arr1,arr2);
    }
    @Test
    public void testArraysAreEqual2()
    {
        assertArrayEquals(arr1,arr2);
    }
}
