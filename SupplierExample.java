package FunctionalInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		
//		ANONYMOUS INNER CLASS
//		Supplier<LocalDateTime> now = new Supplier<LocalDateTime>(){
//			@Override
//			public LocalDateTime get() {	
//				return LocalDateTime.now();
//			}	
//		};
//		System.out.println(now.get());
		
//		LAMBDA EXPRESSION
//		Supplier<LocalDateTime> now = () -> LocalDateTime.now();
//		System.out.println(now.get());
		
//		Supplier<List<Product>> products = () -> {
//			List<Product> productList = new ArrayList<Product>();
//			productList.add(new Product(1, "shirt", 400.00));
//			productList.add(new Product(2, "pant", 300.00));
//			productList.add(new Product(3, "headphones", 200.00));
//			productList.add(new Product(4, "monitor", 500.00));
//			return productList;
//		};
//		System.out.println(products.get());
//		Calling a separate method to supply products
		System.out.println(CreateAndSupplyProducts().get());
	}
	
//	Creating a separate method to supply products
	private static Supplier<List<Product>> CreateAndSupplyProducts(){
			Supplier<List<Product>> products = () -> {
			List<Product> productList = new ArrayList<Product>();
			productList.add(new Product(1, "shirt", 400.00));
			productList.add(new Product(2, "pant", 300.00));
			productList.add(new Product(3, "headphones", 200.00));
			productList.add(new Product(4, "monitor", 500.00));
			return productList;
		};
		return products;
	}
}
