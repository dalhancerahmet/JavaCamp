package Models.Concrete;

import Models.Customer;
import Models.Abstract.BaseCustomerManager;

public class NeroCustomerManager extends BaseCustomerManager {
	@Override
	public void  save(Customer customer) {
		System.out.println("Veritaban�na m��teri kayd� yap�ld�."+" "+"Kay�t yap�lan m��teri:"+customer.getFirstName());
		
	}

}
