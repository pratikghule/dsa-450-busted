import java.util.*;
class arr_rev
{
		public static void main(String args[])
		{
			int arr[] = {1,2,3,4,5};
			int n = 5;
			Scanner sc = new Scanner(System.in);
					print_arr(method_1(arr,n));
			
		}
		static int[] method_1(int[] arr, int n)
		{
			int start=0;
			int end=n-1;
			while(start < end)
			{
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			return arr;
		}
		
		static void print_arr(int[] arr)
		{
			System.out.println(Arrays.toString(arr));
		}
}