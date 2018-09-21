import java.util.Scanner;

public class Pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1,m;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
        }
        System.out.println();
        }
        for(int i=n;i>=1;i--){m=k-i;
            for(int j=1;j<=i;j++)
            {
                System.out.print(m+" ");
                m++;
            }k=k-i;
            System.out.println();
        }
    }
}
