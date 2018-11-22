package Assignment1;
import java.util.*;
public class MissingNumber{

     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 int n,i;
    	 int sum=0;
         System.out.println("Enter array size");
         n=sc.nextInt();
         int a[]=new int[n];
         System.out.println("Enter array elements");
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
         System.out.println("Missing number: "+MissingNum(a));
    
     }
     public static int MissingNum(int a[])
     {
    	 int n=a.length,j,sum=0,sum2=0,res=0;
    	 sum=(a[n-1]*(a[n-1]+1))/2;
         
         sum2=0;
         for(j=0;j<n;j++)
        	 sum2=sum2+a[j];
         res=sum-sum2;
         return res;
     }
}