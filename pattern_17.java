package practices;

public class pattern_17 {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(j==i || i+j==4){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        System.out.println("");
        System.out.println(" ");
        for (int i=0;i<2*n;i++){
            for (int j=0;j<2*n-3;j++){
                if(j==i || j==n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}


//  *   *
//   * *
//    *
//   * *
//  *   *


//  *     *
//   *   *
//    * *
//     *
//    * *
//   *   *
//  *     *
