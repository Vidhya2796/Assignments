package Assignment1;
import java.util.*;
public class Marks {

	public static void main(String[] args) 
	{
		int i;
		int arr[]=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 20 marks");
		for(i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		int newarr[]=fnMarks(arr);
		for(i=0;i<newarr.length;i++) {
			System.out.println(newarr[i]);
		}
	}
	public static int[] fnMarks(int arr[])
	{
		int i,z=0;
		int newarr[]=new int[3];
		for(i=0;i<20;i++)
		{
			if(arr[i]>=86)
			{
				newarr[z++]=arr[i];
			}
		}
		return newarr;
	}
}
