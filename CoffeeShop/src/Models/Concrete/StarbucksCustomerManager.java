package Models.Concrete;

import Models.Customer;
import Models.Abstract.BaseCustomerManager;
import Models.Abstract.CustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void  save(Customer customer) {
		if(customerCheckService.CheckPerson(customer)) {
			System.out.println("Veritaban�na m��teri kayd� yap�ld�."+" "+"Kay�t yap�lan m��teri:"+customer.getFirstName());
		}else {
			System.out.println("Kimlik Do�rulanamad�. L�tfen bilgileri kontrol edip tekrar deneyiniz.");
		}	
		
	}

}
