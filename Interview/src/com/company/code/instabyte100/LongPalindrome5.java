package com.jayaprakash.instabyte100;

public class LongPalindrome5 {
    public static void main(String[] args) {

        String s="geeksskeeg";
        //System.out.println(longestPalindrome1(s));
        System.out.println(longPalindromeDP(s));

    }

    //Two pointer method
    public static String longestPalindrome1(String s) {

        int resLen = 0, resIdx = 0;

        for (int i = 0; i < s.length(); i++) {
            // odd length
            int l = i, r = i;
            while (l >= 0 && r < s.length() &&
                    s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    resIdx = l;
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }

            // even length
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() &&
                    s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    resIdx = l;
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return s.substring(resIdx, resIdx + resLen);
    }

    public static String longPalindromeDP(String s) {

        int n=s.length();
        boolean[][] dp= new boolean[n][n];

        int maxLen=1;
        int start=0;
        
        for (int i = 0; i < n; i++) {
            dp[i][i]=true;
        }

        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)) {
                dp[i][i+1]=true;
                start=i;
                maxLen=2;
            }
        }

        for (int k = 3; k <=n ; k++) {
            for (int i = 0; i < n-k+1; i++) {

                int j=i+k-1;

                if(dp[i+1][j-1] && s.charAt(i)==s.charAt(j)) {

                    dp[i][j]=true;

                    if(k>maxLen) {
                        start=i;
                        maxLen=k;
                    }
                }
            }
        }
        return s.substring(start,start+maxLen);
    }

}
