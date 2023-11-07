package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream4 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Nandha", 21, 123455, new Mark(50, 49, 40)));
		students.add(new Student("Kumar", 20, 123456, new Mark(40, 49, 40)));
		students.add(new Student("Vikram", 22, 142345, new Mark(40, 30, 50)));
		students.add(new Student("Sethu", 21, 452345, new Mark(20, 29, 30)));
		Map<Integer, List<Student>> collectedResult = students.stream()
			.collect(Collectors.groupingBy(Student::getAge));
		System.out.println(collectedResult);
		
		Map<Boolean, List<Student>> partionedResult = students.stream()
				.collect(Collectors.partitioningBy(student -> student.getAge() > 20));
		System.out.println(partionedResult);
	}
}
