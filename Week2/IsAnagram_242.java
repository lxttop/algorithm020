package leetcode.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsAnagram_242 {

    public static boolean isAnagramI(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArray =  s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
    public static boolean isAnagramII(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++){
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i)] < 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> table = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);
            table.put(ch, table.getOrDefault(ch, 0) - 1);
            if (table.get(ch) < 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {0,1,0,3,10,0,0,8};
        for(int i=0;i<nums.length;i++){
            System.out.println(i+" : "+nums[i]);
        }
        System.out.println(isAnagram("gao", "oag"));
        System.out.println(isAnagram("gao", "ozg"));

    }
}
