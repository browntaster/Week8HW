package Q4Inheritance;

public class Cheetah extends Animal{
    public void move() {
        System.out.println("The Cheetah is moving really fast");
    }

    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah();
        cheetah.move();
    }
}
