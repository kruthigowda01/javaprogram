//WAP to declare and instantiate an array for different datatypes. Display elements of array using for each loop.

public class Array05
{
	public static void main(String[] args)
	{
		//int array
		int[] intArr = new int[5];
		
		System.out.println("Displayimg int array content:");
		for(int e : intArr)
		{
			System.out.println(e);
		}
		
		//boolean array
		boolean[] boolArr = new boolean[5];

		System.out.println("Displayimg boolean array content:");
		for(boolean e : boolArr)
		{
			System.out.println(e);
		}
		
		//float array
		float[] floatArr = new float[5];

		System.out.println("Displayimg float default content:");
		for(float e : floatArr)
		{
			System.out.println(e);
		}

		//char array
		char[] charArr = new char[5];

		System.out.println("Displayimg char default content:");
		for(char e : charArr)
		{
			System.out.println(e);
		}
		
		//String array
		String[] stringArr = new String[5];

		System.out.println("Displayimg String default content:");
		for(String e : stringArr)
		{
			System.out.println(e);
		}
	}
}

		
