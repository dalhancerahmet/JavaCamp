package businness;

import models.Student;

public class StudentManager {
	
	public void getStudentInformation(Student student) {
		System.out.println("��renci Ad�:"+" "+ student.getFirsName()+" "
		+"��renci Soyad�:"+student.getLastName()+" "
		+"Kullan�c� ad�:"+student.getUserName()+" "
		+"�ifre:"+student.getPassword()+" "
		+"��renci Aktif mi?:"+student.isActive()+" "
		+"Ald��� Ders:"+student.getHaveToLesson());
	}
	
	public void addToStudent(Student student) {
		Student students= new Student(student.getId(), student.getFirsName(),
				student.getLastName(), student.getUserName(), student.getPassword(),
				student.getEmail(), true, student.getHaveToLesson());
		
		System.out.println("��renci ba�ar�l� bir �ekilde eklendi."+" "+"Eklenen ��renci:"+ students.getFirsName()+" "+ student.getLastName());
		
	}

}
