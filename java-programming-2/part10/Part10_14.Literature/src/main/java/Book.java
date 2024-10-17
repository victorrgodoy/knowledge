public class Book {
    private final String name;
    private final int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " +  this.age + " year-olds or older)";
    }
}
