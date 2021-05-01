package businness;

import models.Student;

public class StudentManager {
	
	public void getStudentInformation(Student student) {
		System.out.println("Öðrenci Adý:"+" "+ student.getFirsName()+" "
		+"Öðrenci Soyadý:"+student.getLastName()+" "
		+"Kullanýcý adý:"+student.getUserName()+" "
		+"Þifre:"+student.getPassword()+" "
		+"Öðrenci Aktif mi?:"+student.isActive()+" "
		+"Aldýðý Ders:"+student.getHaveToLesson());
	}
	
	public void addToStudent(Student student) {
		Student students= new Student(student.getId(), student.getFirsName(),
				student.getLastName(), student.getUserName(), student.getPassword(),
				student.getEmail(), true, student.getHaveToLesson());
		
		System.out.println("Öðrenci baþarýlý bir þekilde eklendi."+" "+"Eklenen Öðrenci:"+ students.getFirsName()+" "+ student.getLastName());
		
	}

}
