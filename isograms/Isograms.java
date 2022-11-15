package isograms;
//An isogram is a word that has no repeating letters, consecutive or non-consecutive.
// Implement a function that determines whether a string that contains only letters is an isogram.
// Assume the empty string is an isogram. Ignore letter case.
public class Isograms {
    public static void main(String[] args) {

    }
    public class isogram {
        public static boolean  isIsogram(String str) {
           return str.length() == str.toLowerCase().chars().distinct().count();
        }
    }
    public class isogram2 {
        public static boolean isIsogram2(String str) {
            char[] chars = str.toLowerCase().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                for (int j = 1 + i; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
