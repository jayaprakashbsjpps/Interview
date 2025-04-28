package com.jayaprakash.instabyte100;

import java.util.Arrays;

public class SelfArray238 {

    public static void main(String[] args) {

        int[] nums={1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        prefix[0]=1;
        suffix[n-1]=1;
        for (int i = 1; i < n; i++) {
            prefix[i]=prefix[i-1] * nums[i-1];
        }
        System.out.println(Arrays.toString(prefix));

        for (int i = n-2; i >=0 ; i--) {
            suffix[i]=suffix[i+1] * nums[i+1];
        }
        System.out.println(Arrays.toString(suffix));
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]= prefix[i] * suffix[i];
        }
        return ans;
    }
}
