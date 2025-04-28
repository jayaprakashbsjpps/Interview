package com.jayaprakash.patterns;

public class Pattern3 {

    public static void main(String[] args) {

//       pattern3(5);
//       pattern4(5);
//       pattern5(10);
       //pattern28(5);
        //pattern30(5);
       // pattern17(5);
        pattern31(4);
    }

    private static void pattern31(int n) {

        for (int row =1; row <= 2*n ; row++) {

            //int totalspaces = (n+1)-row;
            for (int s = 1; s < row; s++) {

                System.out.print((n+1)-s);
            }
            for (int col = 2*n+1; col>row; col--) {

                System.out.print((n+1)-row);
            }

            for (int col = 2; col<2*n; col++) {

                System.out.print((n+1)-row);
            }

            System.out.println();
        }

    }

    static void pattern17(int n) {

        for (int row = 1; row <= 2* n; row++) {

            int c= row > n? 2*n -row : row;
            for (int space = 0; space < n-c; space++) {
                System.out.print(" ");
            }

            for (int col = c; col >0 ; col--) {
                System.out.print(col+" ");
            }



            for (int col = 2; col <=c ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    static void pattern30(int n) {

        for (int row = 1; row <= n; row++) {

            int totalNoOfSpaces = n-row;

            for (int s = 1; s <=totalNoOfSpaces ; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col < 2*row; col++) {

                if((row-col)>0) {
                    System.out.print((row-col)+1);
                } else {
                    System.out.print((col-row)+1);
                }


            }

            System.out.println();

        }
    }

    static void pattern28(int n) {

        for (int row = 0; row < 2*n; row++) {

            int totalColsInRow = row > n ? 2*n - row: row;

            int noOfSpaces= 456;
            for (int s = 0; s <n-totalColsInRow; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <totalColsInRow; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }

    static void pattern5(int n) {
        int mid = (int) Math.floor(n/2);
        for (int i = 1; i <= n; i++) {

            if(i<= mid) {

                for (int j = 1; j <=i; j++) {

                    System.out.print(j);

                }
            } else {

                for (int j = 1; j <=(n+2)- i; j++) {

                    System.out.print(j);

                }
            }


            System.out.println();



        }
    }

    static void pattern4(int n) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print(j);

            }

            System.out.println();

        }
    }

    static void pattern3(int n) {

        for (int i = 6; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }


}
