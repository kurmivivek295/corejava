package dp.immutable;

public final class NonImmutableEmployee {
    private final Integer id;
    private final String name;
    private final Age age;

    public NonImmutableEmployee(Integer id, String name, Age age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
