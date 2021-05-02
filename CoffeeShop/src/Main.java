
import Adapters.MernisServiceAdapter;
import Models.Customer;
import Models.Abstract.BaseCustomerManager;
import Models.Concrete.NeroCustomerManager;
import Models.Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) {
		Customer realCustomer= new Customer(1, "Ahmet", "Dalhançer", 1994, "55543264082");
		Customer fakeCustomer= new Customer(1,"Ali","Cengiz",2000,"212654");
		
		BaseCustomerManager starbuckCustomer= new StarbucksCustomerManager(new MernisServiceAdapter());
		starbuckCustomer.save(realCustomer);
		
		BaseCustomerManager neroCustomer= new NeroCustomerManager();
		neroCustomer.save(fakeCustomer);
		

	}

}
