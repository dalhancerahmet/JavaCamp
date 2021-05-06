package Core.abstracts;

import Entities.concretes.User;

public interface ValidationService {
	boolean validationName(User user);
	boolean validationPassword(User user);
	boolean validationEmail(User user);
	boolean isMailConfirm(User user);

}
