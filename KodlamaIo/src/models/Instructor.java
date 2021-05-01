package models;



public class Instructor extends User {
	String haveToTrainings; // Sahip olunan eðitimler
	int experienceYear; //deneyim yýlý
	
	public Instructor(int id, String firsName, String lastName, String userName, String password, String email,
			boolean active, String haveToTrainings, int experienceYear) {
		super(id, firsName, lastName, userName, password, email, active);
		this.haveToTrainings=haveToTrainings;
		this.experienceYear=experienceYear;
	}

	public String getHaveToTrainings() {
		return haveToTrainings;
	}

	public void setHaveToTrainings(String haveToTrainings) {
		this.haveToTrainings = haveToTrainings;
	}

	public int getExperienceYear() {
		return experienceYear;
	}

	public void setExperienceYear(int experienceYear) {
		this.experienceYear = experienceYear;
	}
	
	
}
