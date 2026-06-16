package JavaLeet;

import java.util.Scanner;

public class SubtractProductSum {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(subtractProductAndSum(n));
    }


    static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;

        while(n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += rem;
            product *= rem;
        }
        return product - sum;
    }
}
