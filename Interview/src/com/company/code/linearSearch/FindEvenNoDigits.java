package com.jayaprakash.linearSearch;

public class FindEvenNoDigits {

    public static void main(String[] args) {

       int[] nums ={12,345,2,6,7896};

       findNumbers2(nums);
    }

    public static int findNumbers2(int[] nums) {

        int evenDigits=0;
        int countEven =0;
        for (int i = 0; i < nums.length; i++) {

            countEven= (int)Math.log10(nums[i]) + 1;
            if(countEven % 2 ==0) {

                // System.out.println(nums[i]);
                evenDigits++;
            }
        }


        return evenDigits;
    }
    public static int findNumbers(int[] nums) {

        int evenDigits=0;

        for(int i=0;i<nums.length;i++) {

            int num = nums[i];
            int countEven =0;
            while(num > 0) {

                num = num/10;
                countEven++;


            }

            if(countEven % 2 ==0) {

                System.out.println(nums[i]);
                evenDigits++;
            }


        }

        return evenDigits;

    }
}
