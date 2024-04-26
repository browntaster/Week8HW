package Q6Polymorphism;

public class Cat extends Animal {
    public void Cat() {
        System.out.println("Cat Meow");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.Sound("Cat Sound");
        c.Cat();
    }
}
