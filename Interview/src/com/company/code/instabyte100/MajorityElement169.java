package com.jayaprakash.instabyte100;

public class MajorityElement169 {

    public static void main(String[] args) {

        int[] nums={2,2,1,1,1,2,2};

        System.out.println(majorityElement(nums));

    }

    public static int majorityElement(int[] nums) {
        int count=0;
        int candidate=0;

        for(int num:nums) {
            if(count==0) {
                candidate=num;
            }
            if(num==candidate) {
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
