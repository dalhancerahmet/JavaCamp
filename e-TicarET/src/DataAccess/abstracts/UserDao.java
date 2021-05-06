package DataAccess.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	List<User> getAll();

}
