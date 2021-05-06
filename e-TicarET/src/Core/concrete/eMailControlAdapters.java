package Core.concrete;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Core.abstracts.eMailControlService;

public class eMailControlAdapters implements eMailControlService {

	@Override
	public boolean isEmailValid(String email) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	    CharSequence inputStr = email;
	    Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern.matcher(inputStr);
	    return matcher.matches();
	}

}
