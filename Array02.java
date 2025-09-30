//WAP to create an array of length 5 and insert 10,12,7,10,15 to it. Display elements of array using loop. 

public class Array02
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 12;
		arr[2] = 7;
		arr[3] = 10;
		arr[4] = 15;

		//arr.length is a instance variable in which stores the size of an array

		for(int i = 0; i < arr.length; i++)	
		{
			System.out.println(arr[i]);
		}
	}
}
