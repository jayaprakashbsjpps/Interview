package com.jayaprakash.instabyte100;

public class NoOfIslands200 {

    public static void main(String[] args) {

        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };

        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {

        if(grid==null || grid.length==0) return 0;

        int islandCount =0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if(grid[i][j]=='1') {
                    dfs(grid,i,j);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    private static void dfs(char[][] grid,int r, int c) {
        if(r<0 ||c<0|| r>=grid.length|| c>=grid[0].length||grid[r][c]=='0') {
            return;
        }

        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
    }
  }
