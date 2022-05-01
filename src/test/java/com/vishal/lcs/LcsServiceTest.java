package com.vishal.lcs;

import org.springframework.stereotype.Component;

import java.util.List;

public class LcsServiceTest {
    public String LCSprint(List<String> list)
    {
        int len = 0;
        int row = 0, col = 0;

        String s1 = list.get(0);
        String s2 = list.get(1);
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;

                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (len < dp[i][j]) {
                        len = dp[i][j];
                        row = i;
                        col = j;
                    }
                }
                else
                    dp[i][j] = 0;
            }
        }

        if (len == 0) {
            return "No string in common";
        }

        StringBuilder result = new StringBuilder();
        String R = "\nAnd length of LCS is: [" + len + "]";

        while (dp[row][col] != 0) {
            result.insert(0, s1.charAt(row - 1));
            --len;
            row--;
            col--;
        }
        return "Longest common Substring is: [" + result + "] " + R;
    }
}