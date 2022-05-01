package com.vishal.lcs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest
class LcsApplicationApplicationTests
{
//    private LcsServiceTest lcsServiceTest;
//
//    @Test
//    void output()
//    {
//        String Expected = "Longest common Substring is: [vishal] \nAnd length of LCS is: [6]";
//        List<String> l1 = new ArrayList<String>();
//        l1.add("vishaljalsdkfno");
//        l1.add("vishaljain");
//        String ActualOutput = lcsServiceTest.LCSprint(l1);
//        assertThat(ActualOutput).isEqualTo(Expected);
//    }

    Calculator underTest = new Calculator();
    @Test
    void itShouldAddNumbers()
    {
        int numberOne = 20;
        int numberTwo = 30;

        int result = underTest.add(numberOne, numberTwo);

        int expected = 50;
        assertThat(result).isEqualTo(expected);
    }
}

class Calculator {

    public int add(int a, int b)
    {
        return a + b;
    }

    public int doMul(int a, int b)
    {
        return a * b;
    }
}