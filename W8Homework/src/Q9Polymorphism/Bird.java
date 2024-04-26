package Q9Polymorphism;

public class Bird extends Animal {

    @Override
    public void move(String name) {
        System.out.println(name);
    }

    @Override
    public void makeSound(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Bird b = new Bird();
        b.move("The bird flies");
        b.makeSound("The bird chirps");
    }
}
