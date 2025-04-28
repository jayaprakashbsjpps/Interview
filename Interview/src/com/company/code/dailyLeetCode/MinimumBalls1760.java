package com.jayaprakash.dailyLeetCode;

public class MinimumBalls1760 {

    public static void main(String[] args) {

        int[] nums={2,4,8,2};
        System.out.println(minimumSize(nums,4));
    }

    public static int minimumSize(int[] nums, int maxOperations) {

        int left =1;
        int right= Integer.MIN_VALUE;


        for(int item:nums) {

            right = Math.max(right,item);
        }

        while(left<=right) {

            int mid=left+(right-left)/2;

            if(isPossible(nums,mid,maxOperations)) {

                right=mid-1;
            } else {

                left=mid+1;
            }
        }

        return left;
    }

    private static boolean isPossible(int[] nums, int mid, int maxOperations) {

        int operations=0;
        for (int num:nums) {

            if(num>=mid){
                operations+=num/mid;
                if(num%mid==0) {
                    operations-=1;
                }
            }
        }
        return operations<=maxOperations;
    }

}
