package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;

public class Stream3 {
	public static void main(String[] args) {
		
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Nandha", 21, 123455, new Mark(50, 49, 40)));
		students.add(new Student("Kumar", 20, 123456, new Mark(40, 49, 40)));
		students.add(new Student("Vikram", 22, 142345, new Mark(40, 30, 50)));
		students.add(new Student("Sethu", 21, 452345, new Mark(20, 29, 30)));
		
//		students.stream()
//			.forEach(student -> System.out.println(student));
		
//		students.stream()
//			.map(student -> student.getName().toLowerCase())
//			.forEach(student -> System.out.println(student));
		
//		Sorting after changing to lower case
//		students.stream()
//		.map(student -> new Student(student.getName().toLowerCase(), student.getAge(), student.getPhoneNum(), student.getMark()))
//		.sorted((student1, student2) -> student1.getName().compareTo(student2.getName()))
//		.forEach(student -> System.out.println(student));
		
//		Student first = students.stream()
//			.filter(student -> student.getAge() > 18)
//			.findFirst()
//			.orElse(null);
//		System.out.println(first);
		
//		students.stream()
//				.filter(student -> student.getAge() > 20)
//				.forEach(student -> System.out.println(student));
		
//		Student maxAge = students.stream()
//			.max(Comparator.comparing(Student::getAge))
//			.orElse(null);
//		System.out.println(maxAge);
		
//		Getting only mark
//		List<Mark> marks = students.stream()
//			.map(student -> student.getMark())
//			.collect(Collectors.toList());
//		System.out.println(marks);
		 
//		Highest Mark1
//		Optional<Mark> marks = students.stream()
//				.map(student -> student.getMark())
//				.reduce((mark1, mark2) -> mark1.getMark1() >mark2.getMark1() ? mark1 : mark2);
//		System.out.println(marks);
		
//		Highest Mark
//		int highest = students.stream()
//			.map(student -> student.getMark().getMark1() + student.getMark().getMark2() + student.getMark().getMark3())
//			.reduce(0, (mark1,mark2) -> mark1 > mark2 ? mark1: mark2);
//		System.out.println(highest);
		
//		Map<Integer, List<Student>> studentsByAge = students.stream()
//				.collect(Collectors.groupingBy(Student::getAge));
//		System.out.println(studentsByAge);
		
//		Number of pass and number of fail
		Map<Boolean, Long> partitionByTotalMark = students.stream()
				.map(student -> student.getMark().getMark1() + student.getMark().getMark2() + student.getMark().getMark3())
				.collect(Collectors.partitioningBy(num -> num > 100, Collectors.counting()));
		System.out.println(partitionByTotalMark);
				
	}
}
