public class maxPop {
    public static void main(String[] args) {
        int[][] logs = {
            {1993, 1999},
            {2000, 2010}
        };
    
    int ans = maximumPopulation(logs);
    System.out.println(ans);
        
    }

    static int maximumPopulation(int[][] logs) {
        int maxPop = 0;
        int maxPopYear = 0;
        for(int year = 1950; year < 2050; year++){
            int yearPop = 0;

           for(int j = 0; j < logs.length; j++){
            if(logs[j][0] <= year && logs[j][1] > year){
                yearPop++;
            }

            if(yearPop > maxPop){
                maxPop = yearPop;
                maxPopYear = year;
            }
           }
            
        }
        return maxPopYear;
    }

    static int maximumPopulation2(int[][] logs) {
        int freq[] = new int[2051];

        for(int log[] : logs) {
            int birth = log[0];
            int death = log[1];

            freq[birth] += 1;
            freq[death] -= 1;
        }

        int currPop = 0;
        int maxPop = 0;
        int minYear = 2050;

        for(int year=1950; year<=2050; year++) {
            currPop += freq[year];
            if(currPop > maxPop) {
                maxPop = currPop;
                minYear = year;
            }
        }

        return minYear;
    }
}
