package com.vishal.lcs;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//@SpringBootTest
class LcsApplicationApplicationTests
{
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