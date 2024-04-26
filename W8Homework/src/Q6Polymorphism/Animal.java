package Q6Polymorphism;

public class Animal {
    public void Sound(String name) {
        System.out.println(name);
    }

    public void Bird(){
        System.out.println("Bird sound");
    }

    public void Cat(){
        System.out.println("Cat sound");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.Sound("Animal Sound");
        animal.Bird();
        animal.Cat();
    }
}
