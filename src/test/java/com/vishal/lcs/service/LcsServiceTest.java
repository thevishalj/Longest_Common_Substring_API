package com.vishal.lcs.service;

import com.vishal.lcs.model.LcsOutput;
import com.vishal.lcs.repository.LcsRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LcsServiceTest
{
    private LcsService lcsService;

    @Test
    void LCSprint()
    {
        String Expected = "Longest common Substring is: [vishal] \nAnd length of LCS is: [6]";

        List<LcsOutput> l1 = new ArrayList<LcsOutput>();

        LcsOutput s1 = new LcsOutput();
        s1.setValue("vishaljain");

        LcsOutput s2 = new LcsOutput();
        s2.setValue("aldkfnavishaljainadf");

        l1.add(s1);
        l1.add(s2);

        String ActualOutput = lcsService.LCSprint(l1);

        assertThat(ActualOutput).isEqualTo(Expected);
    }
}