import java.util.Scanner;

public class SumOfAlternateDigits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        int c=0;int sum=0;
        char arr[]=s.toCharArray();
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
            a[i]=Character.getNumericValue(arr[i]);
        for(int i=0;i<s.length();i=i+2)
            sum+=a[i];
        System.out.print(sum);
    }
}
