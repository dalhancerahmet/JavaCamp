package Core.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Core.abstracts.ValidationService;
import Entities.concretes.User;

public class ValidationManager implements ValidationService {

	@Override
	public boolean validationName(User user) {
		if(!user.getFirstName().isEmpty() && !user.getLastName().isEmpty()) {
			return true;
		}
		System.out.println("Ad veya soyad k�s�mlar� bo� olmamal�d�r.");
		return false;
	}

	@Override
	public boolean validationPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;
		}
		System.out.println("�ifre en az 6 karekter olmal�");
		return false;
		
	}

	@Override
	public boolean validationEmail(User user) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    CharSequence inputStr = user.getEmail();
	    
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(inputStr);
	    boolean result= matcher.matches();
	    if(!result) {
	    	System.out.println("Mail do�ru formatta olmal�d�r.");
	    	return false;
	    }
	    return true;
		
	}

	@Override
	public boolean isMailConfirm(User user) {
		return true;
	}

}
