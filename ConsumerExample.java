package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample{
	
//	IF IMPLEMENTED IN CLASS EXPLICITLY OVERRIDE IT
//	@Override
//	public void accept(String t) {
//		System.out.println("implemented");
//	}
	
	public static void main(String[] args) {
		
//		Consumer<String> obj1 = new ConsumerExample();
//		obj1.accept("hello");
		
//		ANONYMOUS INNER CLASS
//		Consumer<String> obj = new Consumer<String>(){
//			@Override
//			public void accept(String t) {
//				System.out.println("implemented here");
//			}
//		};
//		obj.accept("hi");
		
//		Lambda expression
//		Consumer<Integer> obj = (t) -> System.out.println("multiplied by 10 = " + t*10);		
//		obj.accept(2);
		
//		Consumer<String> obj = (t) -> System.out.println("hello " + t);
//		obj.accept("nandha");
		
		//Chaining consumers
//		Consumer<String> obj = (t) -> System.out.println("hello " + t);
//		Consumer<String> obj2 = (t) -> System.out.println("hi" + t);
// 		obj.andThen(obj2).accept("Nandha");
		
//		for each accepts a consumer
		List<Integer> num = Arrays.asList(1,2,3,4,6,7,4);
		Consumer<Integer> consumer1 = (number) -> System.out.println(number * 2);
		num.forEach(consumer1);
//		or
		num.forEach((number) -> System.out.println(number * 2));
	}
}
