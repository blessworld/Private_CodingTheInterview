package com.company.blessworld;

public class Main {
    public static boolean anagram(String s , String t){
        if (s.length() != t.length() ) return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_t = 0;
        char[] s_array = s.toCharArray();
        for (char c : s_array){
            if (letters[c] == 0) ++num_unique_chars;
            ++letters[c];
        }
        for (int i = 0; i < t.length(); ++i){
            int c = (int) t.charAt(i);
            if (letters[c] == 0){
                return  false;
            }
            --letters[c];
            if (letters[c] == 0){
                ++num_completed_t;
                if (num_completed_t == num_unique_chars){
                    // it's a match if t has been processed completely
                    return  i == t.length() - 1;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
	// write your code here
          System.out.println(anagram("adbd","adbe"));
    }
}
