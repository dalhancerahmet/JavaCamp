package Business.concretes;

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
			System.out.println("Kullan�c� ba�ar�l� bir �ekilde eklendi:"+user.getFirstName()+" "+user.getLastName());
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

}
