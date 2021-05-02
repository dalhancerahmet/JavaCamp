
public class FileLogger extends Logger {

	@Override
	public void log() {
		System.out.println("Dosyaya Loglandý.");
		
	}
	@Override
	public void isSuccess() {
		System.out.println("Loglama baþarýlý.");
		
	}

}
