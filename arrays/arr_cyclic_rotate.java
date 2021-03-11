import java.util.*;
class arr_cyclic_rotate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5};
		int size = 5;
		System.out.println("Enter times to rotate : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			System.out.println( Arrays.toString(cyclic_rotate(arr,size)) );
	}
	static int[] cyclic_rotate(int[] arr,int size)
	{
		int temp = arr[size-1];
		for(int i=size-1;i>0;i--)
		{
			arr[i] = arr[i-1];
		}		
		arr[0] = temp;

		return arr;	
	}
}