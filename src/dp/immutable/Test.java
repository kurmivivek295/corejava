package dp.immutable;

public class Test {

    public static void main(String[] args) {
        NonImmutableEmployee employee = new NonImmutableEmployee(1, "Vivek", new Age(27));
        System.out.println(employee.getAge().getNoOfYears());

        employee.getAge().setNoOfYears(50);
        System.out.println(employee.getAge().getNoOfYears());

        ImmutableEmployee immutableEmployee = new ImmutableEmployee(1, "Vivek", new Age(27));
        System.out.println(immutableEmployee.getAge().getNoOfYears());

        immutableEmployee.getAge().setNoOfYears(50);
        System.out.println(immutableEmployee.getAge().getNoOfYears());
    }

}
