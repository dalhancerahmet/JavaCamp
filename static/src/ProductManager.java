
public class ProductManager {
	
	public void add(Product product) {
		if(Validation.isValid(product)) {
			System.out.println("�r�n eklendi.");
			System.out.println("Eklenen �r�n:"+product.name);
		}
		else {
			System.out.println("�r�n bilgileri ge�ersiz");
		}
		
	}

}
