import Business.concretes.UserManager;
import Core.concrete.ValidationManager;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user= new User(1, "Ahmet", "Dalhan�er", "dalhancerahmet@gmail.com", "123456");
		UserManager userManager= new UserManager(new HibernateUserDao(), new ValidationManager());
		userManager.add(user);

	}

}
