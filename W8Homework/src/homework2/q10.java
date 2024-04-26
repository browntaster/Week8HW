package homework2;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();
        int orignalNum = num;
        int cubeNum = 0;

        while (num>0){
            int reminder = num % 10;
            cubeNum = cubeNum + (reminder*reminder*reminder); // where cubeNum is 0 and int reminder will find last digit of number
            num = num /10; // in each step will find next last digit of number
        }

        if (orignalNum == cubeNum) { // where orignalNum is the number enter by user will match with cubeNum
            System.out.println(orignalNum+ " - It's Armstrong number");
        } else {
            System.out.println(orignalNum+ " - It's not Armstrong Number");
        }
    }
}
