package leetcode.practice;

import java.util.Arrays;

public class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gSize = g.length;
        int sSize = s.length;
        int i = 0, j =0;
        while (i < gSize && j < sSize) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }

}
