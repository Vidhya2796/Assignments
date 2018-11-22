package Assignment1;

public class MoveZeroes {

	public static void main(String[] args) 
	{
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        
       
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
	}
	public static int[] move(int arr[])
    {
	 int count = 0;
     
	 int n = arr.length;
     for (int i = 0; i < n; i++)
         if (arr[i] != 0)
             arr[count++] = arr[i]; 

     
     while (count < n)
         arr[count++] = 0;
     return arr;
    }
}
