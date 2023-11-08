package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
//		String[] arr = new String[] {"a", "b", "c"};
//		Stream<String> stream = Arrays.stream(arr);
//		System.out.println(stream + "here");
		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> data = nums.stream();
//		Stream<Integer> doubledData = data.map(n -> n*2);
//		doubledData.forEach(n ->{
//			System.out.println(n);
//		});

//		Line 13 to 17 in single line
//		Returning three streams
		nums.stream().map(n -> n*2).forEach(n -> System.out.println(n));
	}
}
