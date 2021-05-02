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
			System.out.println("Veritabanýna müþteri kaydý yapýldý."+" "+"Kayýt yapýlan müþteri:"+customer.getFirstName());
		}else {
			System.out.println("Kimlik Doðrulanamadý. Lütfen bilgileri kontrol edip tekrar deneyiniz.");
		}	
		
	}

}
