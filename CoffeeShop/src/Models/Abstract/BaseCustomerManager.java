package Models.Abstract;

import Models.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void  save(Customer customer) {
		System.out.println("Veritabanýna müþteri kaydý yapýldý."+" "+"Kayýt yapýlan müþteri:"+customer.getFirstName());
		
	}

}
