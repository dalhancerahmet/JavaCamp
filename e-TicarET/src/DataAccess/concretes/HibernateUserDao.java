package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import Entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private List<User> users= new ArrayList<User>();
	
	

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("User silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("User güncellendi");
		
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

}
