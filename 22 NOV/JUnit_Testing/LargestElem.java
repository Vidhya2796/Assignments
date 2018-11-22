package Assignment1;
import java.util.*;
public class LargestElem
{
    public static void main (String[] args)
    {
    	int arr[]={10,4,3,50,23,90};
    	int arr2[]= {0};
    	arr2=largest(arr);
    	for (int i = 0; i < 3 ; i ++)
        {
    		System.out.println(arr2[i]);
        }
    	
    }
    public static int[] largest(int arr[])
    {
    	
    	int i,j;
      int arrnew[]=new int[3];
    	int n = arr.length;
           
            
            for(i=0;i<n-1;i++)
    		{
    			for(j=0;j<n-1-i;j++)
    			{
    				if(arr[j]<arr[j+1])
    				{
    					arr[j]+=arr[j+1];
    					arr[j+1]=arr[j]-arr[j+1];
    					arr[j]=arr[j]-arr[j+1];
    				}
    			}
    		}
            arrnew[0]=arr[0];arrnew[1]=arr[1];arrnew[2]=arr[2];
           
            return arrnew;
    }
}