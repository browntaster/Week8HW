package homework2;

public class q8 {
    public static void main(String[] args) {
        int row = 5;

        for (int i =1; i<= row; i++) {
            for (int j = 1; j <= i; j++ ) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
