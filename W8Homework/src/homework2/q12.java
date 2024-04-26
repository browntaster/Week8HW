package homework2;

public class q12 {
    public static void main(String[] args) {

        int num = 13;
        int count = 0;

            for (int i=1; i<=num; i++){
                if (num%1 == 0)
                    count++;
            }
            if (count==2){
                System.out.println("Prime Number");
            } else {
                System.out.println("Not Prime Number");
            }

    }

}
