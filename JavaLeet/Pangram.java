package JavaLeet;

public class Pangram{

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        Boolean ans = checkIfPangram(sentence);
        System.out.println(ans);

    }

    static boolean checkIfPangram(String sentence) {
        //as length is less than 26, it is always a pangram
      if(sentence.length() < 26){
        return false;
      }

      // for marking if the alphabet is shown or not
      boolean[] seen = new boolean[26];

      // loop on sentence
      for(int i = 0; i < sentence.length(); i++){
        char ch = sentence.charAt(i);
        int index = ch - 'a';
        seen[index] = true;
      }

      for(boolean word : seen){
        if(!word) {
            return false;
        }
      }
      return true;
    }
}