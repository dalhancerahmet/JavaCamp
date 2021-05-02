package Models.Concrete;

import Models.Customer;
import Models.Abstract.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void  save(Customer customer) {
		System.out.println("Veritabanýna müþteri kaydý yapýldý."+" "+"Kayýt yapýlan müþteri:"+customer.getFirstName());
		
	}

}
