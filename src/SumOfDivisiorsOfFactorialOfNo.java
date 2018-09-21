import java.util.Scanner;

public class SumOfDivisiorsOfFactorialOfNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int fact=n;int sum=0;

        for(int i=n-1;i>=1;i--)
            fact*=i;
        System.out.println(fact);
for(int i=1;i<=fact;i++)
{
    if(fact%i==0)
        sum+=i;
}
        System.out.println(sum);
    }
}
