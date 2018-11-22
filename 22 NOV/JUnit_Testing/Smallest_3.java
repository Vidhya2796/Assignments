package Assignment1;
import java.util.*;
public class Smallest_3 {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number\n");
		a=sc.nextInt();
		System.out.println("Enter 2nd number\n");
		b=sc.nextInt();
		System.out.println("Enter 3rd number\n");
		c=sc.nextInt();
		System.out.println(min(a,b,c));
	}
	public static int min(int a, int b, int c)
	{
		if(a<b && a<c)
		{
			return(a);
		}
		else if(b<a && b<c)
		{
			return(b);
		}
		else
		{
			return (c);
		}
	}
}
