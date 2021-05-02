
public class SmsLogger extends Logger {

	@Override
	public void log() {
		System.out.println("Sms gönderildi.");
		
	}
	@Override
	public void isSuccess() {
		System.out.println("Loglama baþarýlý.");
		
	}

}
