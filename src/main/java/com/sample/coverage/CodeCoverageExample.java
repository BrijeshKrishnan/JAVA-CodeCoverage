package com.sample.coverage;
public class CodeCoverageExample{

    public int conditionChecker(int a, int b) {
        if(a == 1 && b == 2) {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Failure");
        }
        return a+b;
    }
}