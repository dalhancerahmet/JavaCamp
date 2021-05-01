package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers={new DatabaseLogger(), new FileLogger()};
		CustomerManager customerManager= new CustomerManager(loggers);
		Customer customers= new Customer(1,"Ahmet","Dalhançer");
		
		customerManager.add(customers);

	}

}
