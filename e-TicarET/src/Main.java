import Business.concretes.UserManager;
import Core.concrete.eMailControlAdapters;
import DataAccess.concretes.HibernateUserDao;
import Entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user= new User(1, "Ahmet", "Dalhançer", "dalhancerahmet@gmail.com", "12345");
		UserManager userManager= new UserManager(new HibernateUserDao(), new eMailControlAdapters() );
		userManager.add(user);

	}

}
