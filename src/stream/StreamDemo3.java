package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemo3 {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(101, "Vivek", "Kurmi", 2000.0),
				new Employee(101, "Hemant", "Patel", 5000.0),
				new Employee(101, "Chicku", "Choudhary", 500.0),
				new Employee(101, "Vivek", "Kurmi", 1000.0),
				new Employee(101, "Jiya", "Betu", 1000.0));
		
		boolean isVivekList = empList.stream()
				.anyMatch(e -> e.getFirstName().equals("Vivek"));
		System.out.println(isVivekList);

		Optional<Employee> emp = empList.stream()
					.filter( e1 -> e1.getFirstName().equalsIgnoreCase("Vivek"))
					.findAny();
		System.out.println(emp.get());

	}

}
