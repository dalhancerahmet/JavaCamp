package Models.Abstract;

import Models.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void  save(Customer customer) {
		System.out.println("Veritaban�na m��teri kayd� yap�ld�."+" "+"Kay�t yap�lan m��teri:"+customer.getFirstName());
		
	}

}
