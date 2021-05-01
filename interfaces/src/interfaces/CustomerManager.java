package interfaces;

public class CustomerManager {
	
	Logger[] loggers;
	public CustomerManager(Logger[] logger) {
		this.loggers= logger;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi:"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi:"+customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
		}

}
