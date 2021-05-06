package Business.abstracts;

import java.util.List;

import Entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(User user);
	List<User> getAll();
	

}
