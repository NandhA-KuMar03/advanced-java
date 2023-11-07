package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
	public static void main(String[] args) {
		
//		ANONYMOUS INNER CLASSES
//		Function<String, Integer> lengthOfString = new Function<String, Integer>(){
//			@Override
//			public Integer apply(String t) {
//				return t.length();
//			}
//		};
//		System.out.println(lengthOfString.apply("Nandha"));
		
//		LAMBDA EXPRESSION
//		Function<String,Integer> lengthOfString = (t) -> t.length();
//		System.out.println(lengthOfString.apply("Nandha2"));
		
//		Returns the price of the product
		Function<Product, Double> priceFinder = (product) -> product.getPrice();
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1, "shirt", 200.00));
		products.add(new Product(2, "pant", 300.00));
		products.add(new Product(3, "headphones", 200.00));
		products.add(new Product(4, "monitor", 500.00));
		List<Double> prices = products.stream()
//			.map(product -> priceFinder.apply(product))
			.map(priceFinder)
			.collect(Collectors.toList());
		System.out.println(prices);
//		System.out.println(priceFinder.apply(product1));
	}
}
