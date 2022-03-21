package com.surajit.testclasses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class assertEqualsTest {
    StringHelper object=new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions1(){
        //input->AABC output should be BC
        assertEquals("BC",object.truncateAInFirst2Positions("AABC"));
    }
    @Test
    public void testTruncateAInFirst2Positions2(){
        //input->ABC output should be BC so test should fail
        assertEquals("C",object.truncateAInFirst2Positions("ABC"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame1(){
        //input->ABABCDAB output should be true so test should run
        assertTrue(object.areFirstAndLastTwoCharactersTheSame("ABABCDAB"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame2(){
        //input->ABC output should be false so test should run
        assertFalse(object.areFirstAndLastTwoCharactersTheSame("ABC"));
    }
}
