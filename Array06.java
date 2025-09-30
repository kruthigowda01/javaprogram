//create Student class with id and name as fields. Then create a array for student class add 5 students information

public class Array06
{
	public static void main(String[] args)
	{
		Student[] students = new student[5];
		students[0] = new Student(1, "Santhosh");
		students[1] = new Student(1, "Anand");							students[2] = new Student(1, "Ramya");
		students[3] = new Student(1, "Ganesh");
		students[4] = new Student(1, "Reshma");

		//Displaying usimg for each
		System.out.println("Displaying through for each:");
		for(Student e = students)
		{
			System.out.println("Id:" + e.id + "Name:" + e.name);
		}
		
		//Displaying using for
		System.out.println("\nDisplaying through for:");
		for(int i=0; i<students.length; i++)
		{
			Student s = students[i];
			System.out.println("Id:" + s.id + "Name:" + s.name);
		}
	}
}

		