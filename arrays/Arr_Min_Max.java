import java.util.*;
class Arr_Min_Max
{
	public static void main(String args[])
	{
		int[] arr = {1,2,3,4,5};
		int size = 5;
		
		arr_min_max(arr,size);
		
	}
	static void arr_min_max(int[] arr, int size)
	{
		int min=arr[0],max=arr[0];
		for(int i=0;i<size;i++)
		{
			if(arr[i] < min)
				min = arr[i];
			else if(arr[i] > max)
				max = arr[i];
			
		}
		System.out.print("min="+min+" \n max="+max);
	}
}