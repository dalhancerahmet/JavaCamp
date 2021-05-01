package interfaces;

public class CustomerManager {
	
	Logger[] logger;
	public CustomerManager(Logger[] logger) {
		this.logger= logger;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri Eklendi:"+customer.getFirstName());
		for (Logger logger : logger) {
			logger.log(customer.getFirstName());
		}
		}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi:"+customer.getFirstName());
		for (Logger logger : logger) {
			logger.log(customer.getFirstName());
		}
		}

}
