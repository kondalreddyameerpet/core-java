package MyFirstPackage;

public class Student
{

	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public static void main(String args[]) {
		Student s = new Student("kondal");

		System.out.println(s.getName());
	}
	

}
