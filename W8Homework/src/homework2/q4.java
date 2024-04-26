package homework2;

public class q4 {
    public static int sumDigits (int number) {
        if (number<10) {
            return -1;
        }
        int sum = 0;

        while (number >10){
            int lastdigit = number % 10;
            sum += lastdigit;
            number /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int result1 = sumDigits(125);
        int result2 = sumDigits(-5);
        int result3 = sumDigits(8);

        System.out.println("Sum of digits of 523: "+result1);
        System.out.println("Sum of digits of -5: "+result2);
        System.out.println("Sum of digits of 8: "+result3);
    }
}
