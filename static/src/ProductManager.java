
public class ProductManager {
	
	public void add(Product product) {
		if(Validation.isValid(product)) {
			System.out.println("Ürün eklendi.");
			System.out.println("Eklenen Ürün:"+product.name);
		}
		else {
			System.out.println("Ürün bilgileri geçersiz");
		}
		
	}

}
