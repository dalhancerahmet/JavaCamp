package Business.concretes;

import Business.abstracts.UserService;
import Core.abstracts.eMailControlService;
import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class UserManager implements UserService{
	
	UserDao userDao;
	eMailControlService emailControlService;
	public UserManager(UserDao userDao, eMailControlService eMailControlService) {
		this.userDao= userDao;
		this.emailControlService=eMailControlService;
	}
	

	@Override
	public void add(User user) {
		if(emailControlService.isEmailValid(user.getEmail())) {
			userDao.add(user);
		}else {
			System.out.println("Mail doðru formatta deðil.");
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
