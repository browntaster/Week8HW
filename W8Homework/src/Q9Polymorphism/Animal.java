package Q9Polymorphism;

public class Animal {

    public void move(String name) {
        System.out.println(name);
    }

    public void makeSound(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        a.move("Animal Move");
        a.makeSound("Animal Make Sound");
    }
}
