package com.jayaprakash.dailyLeetCode;

public class TargetSum494 {

    public static void main(String[] args) {

        int[] nums={1,1,1,1,1};
        int target=3;

        System.out.println(findTargetSumWays(nums,target));

    }
    public static int findTargetSumWays(int[] nums, int target) {
        return calculate(nums,0,0,target);

    }

    private  static int calculate(int[] nums,int index,int sum,int target) {

        if(index==nums.length) {
            return sum==target?1:0;
        }

        int add = calculate(nums,index+1,sum+nums[index],target);
        int subtract=calculate(nums,index+1,sum-nums[index],target);

        return add+subtract;
    }
}
