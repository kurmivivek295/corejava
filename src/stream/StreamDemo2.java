package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo2 {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(101, "Vivek", "Kurmi", 1000.0),
				new Employee(101, "Hemant", "Patel", 5000.0),
				new Employee(101, "Chicku", "Choudhary", 500.0),
				new Employee(101, "Jiya", "Betu", 1000.0));
		
		Optional<Double> maxSalary = empList.stream()
				.map( e -> e.getSalary())
				.reduce( (s1, s2) -> Math.max(s1, s2));
		System.out.println(maxSalary.get());

		Optional<Double> sumSalary = empList.stream()
				.map( e -> e.getSalary())
				.reduce( (s1, s2) -> s1 + s2);
		System.out.println(sumSalary.get());

	}

}
