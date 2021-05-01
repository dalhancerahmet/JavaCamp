package businness;

import models.User;

public class UserManager {
	
	public void signIn(User user) {
		System.out.println("Giri� ba�ar�l�. Anasayfaya y�nlendiriliyorsunuz."+" Giri� Yapan Kullan�c�:"+" "+ user.getFirsName());
	}
	
	public void signUp(User user) {
		System.out.println("��k�� yap�ld�."+"Kullan�c�:"+" "+ user.getFirsName());
	}
	
	public void addToUser(User user, String message) {
		User users = new User(user.getId(),user.getFirsName(),user.getLastName(), 
				user.getUserName(), user.getPassword(),user.getEmail(),user.isActive());
		System.out.println(message+" "+users.getFirsName());
	}

}
