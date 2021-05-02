
public class DatabaseLogger extends Logger {

	@Override
	public void log() {
		System.out.println("Veritabanına Loglandı.");
	}

	@Override
	public void isSuccess() {
		System.out.println("Loglama başarılı.");
		
	}
}
