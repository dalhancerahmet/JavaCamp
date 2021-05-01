package models;


public class Student extends User {
	String haveToLesson;
	public Student(int id, String firsName, String lastName, String userName, String password, String email,
			boolean active, String haveToLesson) {
		super(id, firsName, lastName, userName, password, email, active);
		this.haveToLesson=haveToLesson;
		
	}
	public String getHaveToLesson() {
		return haveToLesson;
	}
	public void setHaveToLesson(String haveToLesson) {
		this.haveToLesson = haveToLesson;
	}
}
