package leetcode.practice;

public class ClimbStairs_70 {

    // 找重复性-最近重复子问题 （计算机-for loop recurision）
    public static int climbStairs(int n) {
        if (n <=2 ){return n;}
        int f1 = 1, f2 = 2, f3 = 3;
        for (int i = 3; i <= n; i++){
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }
}
