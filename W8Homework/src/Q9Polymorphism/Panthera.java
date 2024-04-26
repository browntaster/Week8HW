package Q9Polymorphism;

public class Panthera extends Animal {
    @Override
    public void move(String name) {
        System.out.println(name);
    }

    @Override
    public void makeSound(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Panthera p = new Panthera();
        p.move("The panthera prowls");
        p.makeSound("The panthera roars");
    }
}
