package leetcode.practice;

public class PowerOfTwo_231 {

    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n-1)) == 0;
    }
    
}