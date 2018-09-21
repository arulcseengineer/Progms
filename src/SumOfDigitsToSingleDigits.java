import java.util.Scanner;

public class SumOfDigitsToSingleDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=n%9;
        if(n==0)
            System.out.print(0);
        else if(rem==0)
            System.out.print(9);
        else
            System.out.print(rem);
    }
}
