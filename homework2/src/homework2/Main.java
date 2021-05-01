package homework2;

public class Main {
	public static void main(String[] args) {
		Student student = new Student(1,"ireem1881@gmail.com","İrem","can","789563",54);
		Instructor instructor = new Instructor(1,"engindemirog@gmail.com","Engin","Demiroğ","189675","Java & React, C# & Angular");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.doHomework();
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor);
		instructorManager.createHomework();

	}

}
	
	
	


