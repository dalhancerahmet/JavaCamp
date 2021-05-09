import Business.concretes.UserManager;
import Core.concrete.ValidationManager;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user= new User(1, "Ahmet", "Dalhançer", "dalhancerahmet@gmail.com", "123456");
		User fakeUser= new User(2, "Ahmet", "Turan", "ahmetturan@gmail.com", "1355464");
		
		UserManager userManager= new UserManager(new HibernateUserDao(), new ValidationManager());
		
		userManager.add(user);
		
		userManager.login(fakeUser);
		userManager.login(user);
	}

}