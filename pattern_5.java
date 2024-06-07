package practices;

public class pattern_5 {
    public static void main(String[] args) {
        // question -1

        //        int n=5;
        //        for (int i=1;i<=n;i++){
        //            for (int j=1;j<=i;j++){
        //                System.out.print(j+" ");
        //            }
        //            System.out.println(" ");
        //        }
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // question -2

        //        int n=10;
        //        for (int i=1;i<n;i++){
        //            for (int j=i;j<n;j++){
        //                System.out.print(" ");
        //            }
        //            for(int j=1;j<=i;j++){
        //                System.out.print(i+" ");
        //            }
        //            System.out.println(" ");
        //        }

        //                1
        //               2 2
        //              3 3 3
        //             4 4 4 4
        //            5 5 5 5 5
        //           6 6 6 6 6 6
        //          7 7 7 7 7 7 7
        //         8 8 8 8 8 8 8 8
        //        9 9 9 9 9 9 9 9 9

        // question -3

        //        int n=10;
        //        for (int i=1;i<n;i++){
        //            for (int j=i;j<n;j++){
        //                System.out.print(" ");
        //            }
        //            for(int j=1;j<=i;j++){
        //                System.out.print(j+" ");
        //            }
        //            System.out.println(" ");
        //        }

        //                1
        //               1 2
        //              1 2 3
        //             1 2 3 4
        //            1 2 3 4 5
        //           1 2 3 4 5 6
        //          1 2 3 4 5 6 7
        //         1 2 3 4 5 6 7 8
        //        1 2 3 4 5 6 7 8 9

        // question -4

        //        int n=10;
        //        for (int i=1;i<n;i++){
        //            for (int j=i;j<n;j++){
        //                System.out.print(" ");
        //            }
        //            for(int j=1;j<=i;j++){
        //                System.out.print("* ");
        //            }
        //            System.out.println(" ");
        //        }

        //         *
        //        * *
        //       * * *
        //      * * * *
        //     * * * * *
        //    * * * * * *
        //   * * * * * * *
        //  * * * * * * * *
        // * * * * * * * * *

        // question - 5
        //                int n=10;
        //                for (int i=1;i<n;i++){
        //                    for (int j=i;j<n;j++){
        //                        System.out.print("  ");
        //                    }
        //                    for(int j=1;j<=i;j++){
        //                        System.out.print(j+" ");
        //                    }
        //                    for(int j=i-1;j>=1;j--){
        //                        System.out.print(j+" ");
        //                    }
        //                    System.out.println(" ");
        //                }

            //                          1
            //                        1 2 1
            //                      1 2 3 2 1
            //                    1 2 3 4 3 2 1
            //                  1 2 3 4 5 4 3 2 1
            //                1 2 3 4 5 6 5 4 3 2 1
            //              1 2 3 4 5 6 7 6 5 4 3 2 1
            //            1 2 3 4 5 6 7 8 7 6 5 4 3 2 1
            //          1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1

        // question - 6

        int n=10;
        for (int i=1;i<n;i++){
            for (int j=n-1;j>1;j--){
                System.out.print(" ");
            }
            for (int j=9;j>i;j--){
                System.out.print(j +" ");
            }
            for(int j=i-1;j>=1;j--){
                  System.out.print(j+" ");
            }
            System.out.println(" ");
        }



    }



}




