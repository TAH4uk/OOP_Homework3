public final class Immutable {
    private final String name;
    private final int age;

    private Immutable(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}