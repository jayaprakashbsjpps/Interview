package com.jayaprakash.binary;

public class OrderAgnostic {

    public static int orderAgnosticBS(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int mid = 0;

        boolean isAsc = nums[start] < nums[end];

            while(start <= end) {
                mid = (int) Math.floor(start+(end - start)/2);
                if(nums[mid] == target) {

                    return mid;
                }

                if(isAsc) {
                    if(target > nums[mid]) {
                        start = mid + 1;
                    }
                    else {
                        end = mid - 1;
                    }
                } else {
                    if(target > nums[mid]) {
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    }

                }

            }
            return -1;




    }




    public static void main(String[] args) {

        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
}
