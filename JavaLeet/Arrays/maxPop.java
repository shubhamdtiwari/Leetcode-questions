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


    

}
