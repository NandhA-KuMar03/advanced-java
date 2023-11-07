package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//Get a stream, filter only odd numbers, sort it, double it and print it
public class Stream2 {
	public static void main(String[] args) {
		
		//Instead of lambda function we can create a functional interface and make it return the double of a number
//		Function<Integer, Integer> func =  new Function<Integer, Integer>() {
//			@Override
//			public Integer apply(Integer t) {
//				return t*2;
//			}
//			
//		};
		Function<Integer, Integer> func = t -> t*2;

		List<Integer> nums = Arrays.asList(9,8,7,6,5,3);
		nums.stream()
			.filter(n -> n%2==1)
			.map(num -> num*2)
//			.map(func)
			.sorted()
			.forEach(num -> {
				System.out.println(num);
			});
	}
}
