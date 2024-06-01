package org.basics.leetcode;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().maximumWealth(new int[][]{{0, 1, 13}, {4, 5, 6}, {2, 3, 1}}));
        System.out.println(new Solution().maximumWealth(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(new Solution().maximumWealth(new int[][]{{7, 7, 3}, {17, 2, 1}, {3, 2, 1}}));
    }


    public int maximumWealth(int accounts[][]) {

        int [] a = accounts[0];
        int [] b = accounts[1];
        int [] c = accounts[2];

        int d = 0;
        int e = 0;
        int f = 0;

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            d += a[i];
        }

        for (int i = 0; i < b.length; i++) {
            e += b[i];
        }
        for (int i = 0; i < c.length; i++) {
            f += c[i];
        }
        if (d > e) {
            max = d;
        }
        else if (e > f) {
            max = e;
        }
        else {
            max = f;
        }
        return max;
    }

    public int maximumWealth2(int accounts[][]) {
        int max = 0;
        int sum = 0;
        for (int[] account : accounts) {
            for (int i = 0; i < account.length; i++) {
                max += account[i];
            }
        }
        return max;
    }
}
