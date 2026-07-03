package JavaLeet.Arrays;

public class nUniqueInteger {
    public static void main(String[] args) {
        int n = 5;

    }

    static int[] nUniqueIntegers(int n){
        int[] output = new int[n];

        if(n % 2 != 0) {
            output[0] = 0;

            for (int i = 1; i < (n - 1)/2; i++) {
                output[i] = i;
                output[n - i] = -i;
            }
        }else{

            for (int i = 1; i < n / 2; i++) {
                output[i] = i;

                if(n - i == i){
                    output[0] = -i;
                }else{
                    output[n - i] = -i;
                }

                
            }
        }

        return output;
    }
}
