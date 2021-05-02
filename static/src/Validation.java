
public class Validation {
	static {
		System.out.println("construtor çalýþtý");
	}
	public static boolean isValid(Product product) {
		if(!product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}

}
