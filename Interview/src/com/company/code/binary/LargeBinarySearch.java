package com.jayaprakash.binary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class LargeBinarySearch {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("C:\\Users\\jayaprakash.shivasha\\Documents\\DSA\\ObjectOriented\\code\\src\\com\\jayaprakash\\binary\\Binary.txt"));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while(scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        //System.out.println(list.size());
        List<Integer> mountainArr = Arrays.asList(1,2,3,4,5,3,1);

        System.out.println(findPeak(mountainArr));
        scanner.close();
    }

    static int findPeak(List<Integer> mountainArr) {

        //0,5,3,1
        int start = 0;
        int end = mountainArr.size() - 1;
        int index = -1;

        while(start<=end) {

            int mid = (int)Math.floor(start + (end - start)/2);

            if(mountainArr.get(mid) <= mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {

                if(mountainArr.get(mid) > mountainArr.get(mid - 1)) {
                    System.out.println("mid "+ mountainArr.get(mid) +" mid= "+mid);
                    System.out.println("mid - 1 "+mountainArr.get(mid - 1)+" mid= "+(mid -1));
                    index = mid;
                    break;
                }
               else {
                   end = mid -1;
                }
            }


        }

        return index;

    }
}
