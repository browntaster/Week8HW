package Q7Polymorphism;
/*Question 7)
Write a Java program to create a class Vehicle with a method called speedUp(). Create
two subclasses Car and Bicycle. Override the speedUp() method in each subclass to
increase the vehicle's speed differently.*/

public class Vehicle {

    public void sppedUp(int speed) {
        System.out.println("The vehical's speed: "+speed);
    }

    public void Car() {
        System.out.println("The Car Speed: ");
    }

    public void Bicycle() {
        System.out.println("The Bicycle Speed: ");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.sppedUp(20);
        v.Car();
        v.Bicycle();
    }
}
