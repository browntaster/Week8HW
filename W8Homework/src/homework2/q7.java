package homework2;

import java.util.Scanner;

public class q7 {
    public static int sumFirstAndLastDigit(int number) {
        if (number<0){
            return -1;
        }

        int lastDigit = number%10;
        int firstDigit = number;

        while (firstDigit>= 10){
            firstDigit = firstDigit/10;
        }
        return firstDigit+lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(1225));
        System.out.println(sumFirstAndLastDigit(345));
        System.out.println(sumFirstAndLastDigit(-25));
        System.out.println(sumFirstAndLastDigit(9));
        System.out.println(sumFirstAndLastDigit(18));
    }
}
