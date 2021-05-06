package Business.concretes;

import java.util.List;

import Business.abstracts.UserService;
import Core.abstracts.ValidationService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	ValidationService validationService;
	public UserManager(UserDao userDao, ValidationService validationService) {
		this.userDao= userDao;
		this.validationService=validationService;
	}
	

	@Override
	public void add(User user) {
		if(validationService.validationEmail(user) && validationService.isMailConfirm(user) 
				&& validationService.validationName(user) && validationService.validationPassword(user)) {
			userDao.add(user);
			System.out.println("Kullanýcý baþarýlý bir þekilde eklendi:"+user.getFirstName()+" "+user.getLastName());
		}
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}
	
	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public void login(User user) {
		
		for (User users : this.getAll()) {
			if(users.getEmail()==user.getEmail() && users.getPassword()==user.getPassword()) {
				System.out.println("Sisteme giriþ baþarýlý!");
			}else {
				System.out.println("email veya parola hatalý. Terar deneyiniz!");
			}
		}
	}


	

}
