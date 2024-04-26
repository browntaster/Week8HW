package homework2;

public class q11 {
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number >0) {
            int lastDigit = number % 10;

            if (lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-18));
        System.out.println(getEvenDigitSum(742308572));
    }
}
