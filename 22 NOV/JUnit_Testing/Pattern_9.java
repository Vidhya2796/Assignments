package Assignment1;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		int i=1, j=i,k=1, rows;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
	    rows=sc.nextInt();
	    int x=fnPattern(rows);
	}
	public static int fnPattern(int rows)
	{
		int i,j=1,k=1;
		for(i=1; i<=rows; ++i)
	    {
	        for(j=i;j<rows;j++)
	        	System.out.print(" ");
	    	
	    	for(k=1; k<=i; ++k)
	        {
	        	System.out.print("*");
	        }
	        System.out.println();
	    }
		
		return k-1;
	}
}
