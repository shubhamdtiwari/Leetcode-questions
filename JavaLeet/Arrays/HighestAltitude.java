package JavaLeet.Arrays;

public class HighestAltitude {
    public static void main(String[] args) {
       int[] gain = {-5,1,15,0,7};

       int ans = largestAltitude(gain);
       
        System.out.println(ans);
      
        
    }
    static int largestAltitude(int[] gain) {
        int initAlt = 0;
        int[] finalAlt = new int[gain.length + 1];
        finalAlt[0] = initAlt;
        for(int i = 1; i < finalAlt.length; i++){
            finalAlt[i] = finalAlt[i - 1] + gain[i - 1];
        }
       
        int max = finalAlt[0];

        for(int h : finalAlt) {
            if( h > max) {
                max = h;
            }
        }
        return max;
    }
}

