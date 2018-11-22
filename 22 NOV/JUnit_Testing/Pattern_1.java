package Assignment1;

import java.util.Scanner;

public class Pattern_1 
{

	public static void main(String[] args) 
	{
		int i=1, j=i,k=1, n,l;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
	    n=sc.nextInt();

	  int x= fnPattern1(n);
	    	/*for(i=1;i<=n;i++)    
	    	{    
	    	for(j=1;j<=n-i;j++)    
	    	{    
	    		System.out.print(" ");    
	    	}    
	    	for(k=1;k<=i;k++)    
	    	{    
	    		System.out.print(k);    
	    	}    
	    	for(l=i-1;l>=1;l--)    
	    	{    
	    		System.out.print(l);    
	    	}    
	    	System.out.println();  
	    	}    */
	    }
	public static int fnPattern1(int n)
	{
		int i=1, j=i,k=1,l=1;
		for(i=1;i<=n;i++)    
    	{    
    	for(j=1;j<=n-i;j++)    
    	{    
    		System.out.print(" ");    
    	}    
    	for(k=1;k<=i;k++)    
    	{    
    		System.out.print(k);    
    	}    
    	for(l=i-1;l>=1;l--)    
    	{    
    		System.out.print(l);    
    	}    
    	System.out.println();  
    	}
		return l;
	}
	

}
