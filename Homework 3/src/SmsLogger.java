
public class SmsLogger extends Logger {

	@Override
	public void log() {
		System.out.println("Sms g�nderildi.");
		
	}
	@Override
	public void isSuccess() {
		System.out.println("Loglama ba�ar�l�.");
		
	}

}
