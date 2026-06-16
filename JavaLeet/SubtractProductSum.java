package JavaLeet;

public class SubtractProductSum {
    
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
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
