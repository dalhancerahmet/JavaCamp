
public class Validation {
	static {
		System.out.println("construtor �al��t�");
	}
	public static boolean isValid(Product product) {
		if(!product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
