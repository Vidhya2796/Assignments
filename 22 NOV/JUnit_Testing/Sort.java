package Assignment1;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		int n,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be inserted\n");
		n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter elements\n");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int newarr[]=fnSort(arr);
		for(i=0;i<newarr.length;i++)
		{
			System.out.println(newarr[i]+"\n");
		}
	}
	public static int[] fnSort(int arr[])
	{
		int i,j,n=arr.length;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					arr[j]+=arr[j+1];
					arr[j+1]=arr[j]-arr[j+1];
					arr[j]=arr[j]-arr[j+1];
				}
			}
		}
		return arr;
	}
}
