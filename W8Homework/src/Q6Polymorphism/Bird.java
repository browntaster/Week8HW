package Q6Polymorphism;

public class Bird extends Animal {
    @Override
    public void Bird() {
        System.out.println("Bird chirps");
    }

    public static void main(String[] args) {
        Bird r = new Bird();
        r.Sound("Bird Sound");
        r.Bird();
    }
}
