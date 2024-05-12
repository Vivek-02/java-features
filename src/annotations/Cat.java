package annotations;

@VeryImportant
public class Cat {

    @ImportantString
    String name;

    int age;

    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Cat is eating");
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Cat meowed!");
    }
}
