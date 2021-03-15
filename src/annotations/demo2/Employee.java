package annotations.demo2;

public class Employee {
//    Try both options
//    @JsonField("name_json")
    @JsonField
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
