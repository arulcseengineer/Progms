import java.util.Scanner;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s1=""+String.valueOf(n);
        String s2 ="";
        int rem=0;
        while(n>0){
            rem=n%10;
            s2+=""+String.valueOf(rem);
            n=n/10;
        }
        if(s1.equals(s2))System.out.print("YUP");
    }
}

