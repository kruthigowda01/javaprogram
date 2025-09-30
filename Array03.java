//WAP to create an array of length 5 with values 10,12,7,10,15 using array literals. Display elements of array using loop. 

class Array03
{
	public static void main(String[] args)
	{
		int[] arr = {10,12,7,10,15};
		//below line also valid way to initializing array.
		//int[] arr = new int[](10,12,7,10,15);

		//arr.length is a instance variable in which stores the size of an array
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
