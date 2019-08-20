package com.sample.test;

import static org.junit.Assert.*;

import com.sample.coverage.CodeCoverageExample;
import org.junit.Test;



public class CodeCoverageTest {

    CodeCoverageExample coverage = new CodeCoverageExample();

    @Test
    public void test() {

        assertEquals(3, coverage.conditionChecker(1,2), 0);
    }

    @Test
    public void test1() {
        assertEquals(4, coverage.conditionChecker(1,3), 0);
    }

    @Test
    public void test2() {
        assertEquals(2, coverage.conditionChecker(0,2), 0);
    }

}