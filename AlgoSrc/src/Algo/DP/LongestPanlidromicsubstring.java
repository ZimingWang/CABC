package Algo.DP;

/**
 * Created by wangziming on 10/16/16.
 */
public class LongestPanlidromicsubstring {

    public static void main(String[] arr){
        String input = "cabbaccada";
        System.out.println(longestPalindrome(input));
    }


        public static String longestPalindrome(String s) {
            int len = s.length();
            Boolean[] ref = new Boolean[len+1];//用来记录i到j的string是不是palindrome
            java.util.Arrays.fill(ref, true);

            int maxlen = 0;
            int maxi = 0;
            for (int j = 0; j < len; j++) // Beginning of the string
            {
                for (int i = 0; i <= j; i++)
                {
                    if (s.charAt(i) == s.charAt(j)) ref[i] = ref[i+1];
                    else ref[i] = false;

                    if (ref[i]) {
                        int curlen = j - i + 1;
                        if (curlen > maxlen) {maxi = i; maxlen = curlen;}
                    }    // If ref[j] is true, then update the answer
                }
            }
            return s.substring(maxi, maxi + maxlen);
        }
}

/*
 class Solution {
    public static String longestPalindrome(String s) {
        String T = preProcess(s);
        int n = T.length();
        int[] p = new int[n];
        int center = 0, right = 0;
        for (int i = 1; i < n - 1; i++) {
            int j = 2 * center - i;  //j and i are symmetric around center
            p[i] = (right > i) ? Math.min(right - i, p[j]) : 0;

            // Expand palindrome centered at i
            while (T.charAt(i + 1 + p[i]) == T.charAt(i - 1 - p[i]))
                p[i]++;

            // If palindrome centered at i expand past right,
            // then adjust center based on expand palindrome
            if (i + p[i] > right) {
                center = i;
                right = i + p[i];
            }
        }

        //  Find the longest palindrome
        int maxLength = 0, centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (p[i] > maxLength) {
                maxLength = p[i];
                centerIndex = i;
            }
        }

        centerIndex = (centerIndex - 1 - maxLength) / 2;
        return s.substring(centerIndex, centerIndex + maxLength);
    }

    // preProcess the original string s.
    // For example, s = "abcdefg", then the rvalue = "^#a#b#c#d#e#f#g#$"
    private static String preProcess(String s) {
        if (s == null || s.length() == 0)  return "^$";
        StringBuilder rvalue = new StringBuilder("^");
        for (int i = 0; i < s.length(); i++)
            rvalue.append("#").append(s.substring(i, i+1));
        rvalue.append("#$");
        return rvalue.toString();
    }
}*/
