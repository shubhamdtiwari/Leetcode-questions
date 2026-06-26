package JavaLeet;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatching {
    public static void main(String[] args) {
       List<List<String>> items = new ArrayList<>();
       items.add(new ArrayList<>(List.of("phone", "blue", "pixel")));
       items.add(new ArrayList<>(List.of("computer", "silver", "lenovo")));
       items.add(new ArrayList<>(List.of("phone", "gold", "iphone")));

       String ruleKey = "color";
       String ruleValue = "silver";

       int ans = countMatches(items, ruleKey, ruleValue);
       System.out.println(ans);
        
    }
    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){

        int result = 0;

        if(ruleKey.equals("type")){
            for (int i = 0; i < items.size(); i++) {
                 if(items.get(i).get(0).equals(ruleValue)){
                        result += 1;
                    }
                }
                
            }else if(ruleKey.equals("color")){
                for(int i = 0; i < items.size(); i++){
                    if(items.get(i).get(1).equals(ruleValue)){
                       result += 1;
                    }
                }
            }else if(ruleKey.equals("name")){
                for(int i = 0; i < items.size(); i++){
                    if(items.get(i).get(2).equals(ruleValue)){
                         result += 1;
                    }
               }
            }
        return result;
        }

        static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue){
            int result = 0;
            int index = 0;

            if(ruleKey.equals("color")){
                index = 1;
            }else if(ruleKey.equals("name")){
                index = 2;
            }

           for (int i = 0; i < items.size(); i++) {
             if(items.get(i).get(index).equals(ruleValue)){
                result++;
             }
           }

           return result;
        }

    }

