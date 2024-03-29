package dp.immutable;

public final class ImmutableEmployee {
    private final Integer id;
    private final String name;
    private final Age age;

    public ImmutableEmployee(Integer id, String name, Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setNoOfYears(this.getAge().getNoOfYears());
        this.age = cloneAge;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
