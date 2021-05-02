
public class DatabaseLogger extends Logger {

	@Override
	public void log() {
		System.out.println("Veritabanýna Loglandý.");
	}

	@Override
	public void isSuccess() {
		System.out.println("Loglama baþarýlý.");
		
	}
}
