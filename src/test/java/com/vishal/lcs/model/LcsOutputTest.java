package com.vishal.lcs.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LcsOutputTest {

    LcsOutput s = new LcsOutput();

    @Test
    void testToString()
    {
        String Expected = "alsdkjvishallakdsfn";

        s.setValue("alsdkjvishallakdsfn");
        String Actual = s.getValue();

        assertThat(Actual).isEqualTo(Expected);
    }
}