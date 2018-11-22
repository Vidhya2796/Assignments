package Assignment1;

import java.util.Scanner;

public class Swap2 {

	public static void main(String[] args)
	{
		int a,b,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number\n");
		a=sc.nextInt();
		System.out.println("Enter 2nd number\n");
		b=sc.nextInt();
		int arr[]=swap(a,b);
		System.out.println("Swapped Values\na= "+arr[0]+"\nb= "+arr[1]);
	}
	public static int[] swap(int a,int b)
	{
		//int temp;
		a=a+b;
		b=a-b;
		a=a-b;
		int arr[]=new int[2];
		arr[0]=a;
		arr[1]=b;
		return arr;
	}
}
