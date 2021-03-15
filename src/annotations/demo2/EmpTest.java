package annotations.demo2;

public class EmpTest {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Vivek");

        JsonSerializer jsonSerializer = new JsonSerializer();
        System.out.println(jsonSerializer.serialize(employee));
    }

}
