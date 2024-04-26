package homework2;

public class q9 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int sum = 0;

        System.out.println("Fibonacci Sequence: ");

        for (int i =2; i<20; i++) {
            sum = n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }
    }
}
