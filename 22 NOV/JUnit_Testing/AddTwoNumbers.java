package Assignment1;
import java.util.*;
public class AddTwoNumbers {
	public static void main(String[] args)
	{
		int a,b,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 elements\n");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("The Sum of "+a+" and "+b+" is = "+(add(a,b)));
	}
	public static int add(int a, int b)
	{
		return a+b;
	}
}
