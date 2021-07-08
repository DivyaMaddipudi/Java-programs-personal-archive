import java.util.Scanner;

public class Happy_Number_202 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();


        int squareValue = 0;


        while(value > 9) {

            while (value >  0) {
                int rem = value % 10;
                squareValue = squareValue + (rem * rem);
                value = value / 10;
            }

            value = squareValue;

            squareValue = 0;

        }
        if(value == 1) {
            System.out.println("Happy number");
        } else {
            System.out.println("Not");
        }
    }
}
