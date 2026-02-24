package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;


public class StreamApi {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, 28, 3.7));
		list.add(new Student(3, 20, 3.1));
		list.add(new Student(6, 26, 3.9));
		list.add(new Student(7, 21, 2.9));
		list.add(new Student(10, 20, 3.3));
		
		List<Integer> result =
				list.stream()
				.filter(s -> s.getAge() < 25)
				.sorted(comparing(Student::getGpa)
				.reversed())
				.map(Student::getId)
				.collect(Collectors.toList());

		
		System.out.println(result);
	}

}
