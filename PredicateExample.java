package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {
	public static void main(String[] args) {
//		ANONYMOUS INNER CLASS returns true only if it contains hi
//		Predicate<String> predicate1 = new Predicate<String>() {
//			@Override
//			public boolean test(String t) {
//				return t.contains("hi");
//			}
//		};
//		System.out.println(predicate1.test("dahifsisd"));
		
//		Predicate<String> predicate1 = (input) -> input.contains("hi");
//		System.out.println(predicate1.test("dahifsisd"));
		List<Product> products = GetProducts().get();
		Predicate<Product> predicate1 = (input) -> input.getPrice() > 300.00;
		Predicate<Product> predicate2 = (input) -> input.getPrice() < 500.00;
		products.stream()
			.filter(predicate1.and(predicate2))
			.forEach(product -> System.out.println(product));
		
	}
	private static Supplier<List<Product>> GetProducts(){ 
		Supplier<List<Product>> productList = () ->{
			List<Product> products = new ArrayList<Product>();
			products.add(new Product(1, "shirt", 400.00));
			products.add(new Product(2, "pant", 300.00));
			products.add(new Product(3, "headphones", 200.00));
			products.add(new Product(4, "monitor", 500.00));
			return products;
		};
		return productList;
	}
}
