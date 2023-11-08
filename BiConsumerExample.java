package FunctionalInterface;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;

public class BiConsumerExample {
	public static void main(String[] args) {
		BiConsumer<LocalDateTime, Integer> testFunc = (a, b) -> {
			if(a.getHour()==b) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		};
		
		testFunc.accept(LocalDateTime.now(), 10);
	}
}
