package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.id=1;
		individualCustomer.firstName="Ahmet";
		individualCustomer.customerNumber="45545";
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.id=1;
		corporateCustomer.companyName="Dalhançer A.Þ";
		corporateCustomer.taxName="Malatya Vergi Dairesi";
		corporateCustomer.customerNumber="123";
		
		UnionCustomer unionCustomer= new UnionCustomer();
		unionCustomer.customerNumber="98798798";
		
		Customer[] customers= {unionCustomer,corporateCustomer,individualCustomer};
		CustomerManager customerManager= new CustomerManager();
		customerManager.addMultiple(customers);
		
		

	}

}
