package thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

class Employee {
    String username;
    String password;

    public Employee() {
    }

    public Employee(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class EmpPair {
    Employee empA;
    Employee empZ;

    public EmpPair() {
    }

    public EmpPair(Employee empA, Employee empZ) {
        this.empA = empA;
        this.empZ = empZ;
    }

    public Employee getEmpA() {
        return empA;
    }

    public void setEmpA(Employee empA) {
        this.empA = empA;
    }

    public Employee getEmpZ() {
        return empZ;
    }

    public void setEmpZ(Employee empZ) {
        this.empZ = empZ;
    }
}

public class CompletableFDemoSupplyAync {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Vivek", "Vivek"),
                new Employee("Jiya", "Jiya"),
                new Employee("Hemant", "Hemant"),
                new Employee("CHicku", "CHicku"),
                new Employee("Manisha", "Manisha"),
                new Employee("Vandna", "Vandna"),
                new Employee("CHanda", "CHanda")
        );

        List<EmpPair> empPairs = new ArrayList<>();

        for (int i = 1; i < employees.size(); i++) {
            empPairs.add(new EmpPair(
                    new Employee(employees.get(0).getUsername(), employees.get(0).getPassword()),
                    new Employee(employees.get(i).getUsername(), employees.get(i).getPassword())
            ));
        }

        Long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " : Start time: " + startTime);

        ExecutorService pool = Executors.newFixedThreadPool(empPairs.size() * 2);
        empPairs.parallelStream().map( e ->
            CompletableFuture.allOf(CompletableFuture.supplyAsync(() -> stdEmp(e.getEmpA()), pool),
                    CompletableFuture.supplyAsync(() -> stdEmp(e.getEmpZ()), pool)).join()
        ).collect(Collectors.toList());

        pool.shutdown();

        Long endTime = System.currentTimeMillis();;
        System.out.println(Thread.currentThread().getName() + " : End time: " + endTime);
        System.out.println(Thread.currentThread().getName() + " : Execution time: " + (endTime - startTime));
    }

    public static Employee stdEmp(Employee employee) {
        Employee employee1 = new Employee();
        employee1.setUsername(employee.getUsername().concat("-STD"));
        employee1.setPassword(employee.getPassword());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return employee1;
    }
    public static void stdEmpVoid(Employee employee) {
        employee.setUsername(employee.getUsername().concat("-STDVoid"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
