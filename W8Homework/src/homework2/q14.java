package homework2;

public class q14 {
    public static void main(String[] args) {
        int row = 7;

        for (int i=0; i<row; i++){
            for (int j=0; j<row-i; j++){
                System.out.println(" ");
            }
            for (int j=0; j<=i; j++){
                System.out.println("* ");
            }
            System.out.println();
        }
    }
}
