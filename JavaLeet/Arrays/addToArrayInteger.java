package JavaLeet.Arrays;

import java.util.ArrayList;
import java.util.List;

public class addToArrayInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,0};
        int k = 34;
        List<Integer> value = addToArrayForm(num, k);
        for(int el : value){
            System.out.println(el + " ");
        }
    }

    static List<Integer> addToArrayForm(int[] num, int k){
        ArrayList<Integer> ans = new ArrayList<>();

        int i = num.length - 1;
        int carry = 0;

        while(i >= 0 && (k > 0 || carry > 0)){

            num[i] += carry + k % 10;
            carry = num[i] / 10;
            num[i] %= 10;
            k /= 10;
            i--;

        }

        k += carry;
        while(k>0)
        {
            ans.add(0,k%10);
            k/=10;
        }
        for(int j:num) ans.add(j);
        return ans;
    }
}
