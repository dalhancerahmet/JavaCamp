package inheritance;

public class CustomerManager {
	
	public void add(Customer customer) {
		System.out.println("M��teri Numaran�z:"+customer.customerNumber+" "+",Eklendi.");
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}

}
