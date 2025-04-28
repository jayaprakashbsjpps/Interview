package com.jayaprakash.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetMatrixZeros73 {

    public void setZeroes(int[][] matrix) {

        Map<Integer, List<Integer>> rowColMap= new HashMap<Integer,List<Integer>>();

        rowColMap=getZeros(matrix,rowColMap);

        for (List<Integer> valueList:rowColMap.values()) {
            setRowZeros(valueList.get(0),valueList.get(1),matrix);
        }

        for (List<Integer> valueList:rowColMap.values()) {
            setColumnZeros(valueList.get(0),valueList.get(1),matrix);
        }

    }

    public Map<Integer,List<Integer>> getZeros(int[][] matrix,  Map<Integer,List<Integer>> rowColMap) {

        int count = 0;
        for(int i=0; i<matrix.length;i++) {

            for(int j=0; j<matrix[i].length;j++) {

                if(matrix[i][j]==0) {
                    count++;
                    rowColMap.put(count, Arrays.asList(i,j));

                }

            }
        }

        return rowColMap;

    }

    public void setRowZeros(int i, int j,int[][] matrix) {

        for(j=0; j<matrix[i].length;j++) {

            matrix[i][j]=0;
        }
    }

    public void setColumnZeros(int i, int j,int[][] matrix) {

        for(i=0;i<matrix.length;i++) {

            matrix[i][j]=0;

        }


    }
}
