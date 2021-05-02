
public class Validation {
	public static boolean isValid(Product product) {
		if(!product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
