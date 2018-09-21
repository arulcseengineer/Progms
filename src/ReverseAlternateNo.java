import java.util.Scanner;

public class ReverseAlternateNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String  s=sc.next();
        int sum=0;
        int q=0;
        int j,i,k;
        char arr[]=s.toCharArray();
        int a[]=new int[s.length()];int c[]=new int[s.length()];
        int b[]=new int[s.length()];
        for(int i2=0;i2<s.length();i2++)
            a[i2]=Character.getNumericValue(arr[i2]);
        for(i=1,j=1;i<s.length();i=i+2,j++)
            b[j]=(a[i]);
        for(i=0,k=j-1;i<arr.length ;i=i+2,k=k-1){
            c[q]=a[i];
            //System.out.print(a[i]);
            q++;if(k==0)
                break;
            c[q]=b[k];q++;
           // System.out.print(b[k]);
            }
       /* for(int i1=0,k=j;i1<b.length-1;i1++,k--)
            a[i1]=b[k];*/
        for(int q1=0;q1<q;q1++)
            System.out.print(c[q1]);
    }
}
