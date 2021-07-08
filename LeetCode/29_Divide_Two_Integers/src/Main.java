import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quotient = 0;
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        long result;

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1: 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        if((dividend < (Math.pow(2, 31))) && dividend < 0) {
            result = (int)(sign * ((Math.pow(2, 31))));
        } else {

            while(dividend >= divisor) {
                dividend = dividend - divisor;
                quotient = quotient + 1;
            }
            result = quotient * sign;
        }
        System.out.println(result);
    }
}