package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamDemo5 {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(101, "Vivek", "Kurmi", 2000.0),
				new Employee(101, "Hemant", "Patel", 5000.0),
				new Employee(101, "Chicku", "Choudhary", 500.0),
				new Employee(101, "Vivek", "Kurmi", 1000.0),
				new Employee(101, "Jiya", "Betu", 1000.0));

		empList.stream().map(Employee::getSalary)
				.sorted(Comparator.reverseOrder())
				.limit(2)
				.skip(1)
				.forEach(System.out::println);

	}

}
