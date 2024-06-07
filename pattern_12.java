package practices;

public class pattern_12 {
    public static void main(String[] args) {
        int n=7;
        for (int i=1;i<=2*n;i++){
            for (int j=i;j<n;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                if ( k==i || k==1 ||i==n){
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
