import businness.InstructorManager;
import businness.StudentManager;
import businness.UserManager;
import models.Instructor;
import models.Student;
import models.User;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1,"Ahmet","Dalhan�er","dalhancerahmet","12345",
			"dalhancerahmet@gmail.com",true,"Java Kamp�");
		
		Student student2 = new Student(2,"Engin","Demiro�","engindemirog","12345",
				"engin@engin.com",true,"Java Kamp� ve C# Kamp�");
		
		User user= new User(1,"Ahmet","Dalhan�er","dalhancerahmet","12345",
				"dalhancerahmet@gmail.com",true);
		StudentManager studentManager= new StudentManager();
		studentManager.getStudentInformation(student);
		
		studentManager.addToStudent(student2);
		
		Instructor instructor= new Instructor(1, "Engin", "Demiro�", "engindemirog", "12345", "engin@engin.com",
				true, "Java-C#-Angular-React", 20);
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.getInstructorInformation(instructor);
		
		UserManager userManager= new UserManager();
		userManager.signIn(student);
		
		userManager.addToUser(user,"Eklenen Kullan�c�:");
	}

}
