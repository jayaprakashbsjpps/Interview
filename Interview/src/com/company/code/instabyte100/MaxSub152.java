package com.jayaprakash.instabyte100;

public class MaxSub152 {

    public static void main(String[] args) {

        int[] nums={2,3,-2,4};

        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {

        if(nums==null || nums.length==0) return 0;

        int maxProduct = nums[0],minProduct=nums[0],result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i],nums[i]*maxProduct);
            minProduct = Math.min(nums[i],nums[i]*minProduct);
            result=Math.max(result,maxProduct);
        }

        return result;
    }


}
