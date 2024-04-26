package homework2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = sc.nextInt();
        int min = number % 10;
        int max = number % 10;

        while (number > 0) {
           int digit = number % 10;
           min = Math.min(min, digit);
           max = Math.max(max, digit);
           number /= 10;
        }
        System.out.println("Maximum Number Is : "+max);
        System.out.println("Minimum Number Is: "+min);

        sc.close();
    }
}
