
public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        char ans = 'a';
      int max = 0;
      int num[] = new int[256];
      for (int i = 0; i < str.length(); i++) {
         num[str.charAt(i)]++;
         if (num[str.charAt(i)] > max) {
            max = num[str.charAt(i)];
            ans = str.charAt(i);
         }
      }
      return ans;
       }
    }

