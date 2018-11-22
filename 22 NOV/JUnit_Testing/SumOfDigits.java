package Assignment1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
	    n=sc.nextInt();
	    int res=fnSum(n);
	    System.out.println("The sum of digits is: "+res);
	}
	public static int fnSum(int n)
	{
		int d,sum=0;
		while(n>0)
	    {
	    	d=n%10;
	    	sum+=d;
	    	n/=10;
	    }
		return sum;
	}
}
