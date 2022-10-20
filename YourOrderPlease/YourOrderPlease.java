package YourOrderPlease;
//Your task is to sort a given string. Each word in the string will contain a single number.
// This number is the position the word should have in the result.
// Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
// If the input string is empty, return an empty string.
// words in the input String will only contain valid consecutive numbers.



public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
    public static String order(String words) {
        String [] lines = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10 ; i++) {
            for (String word: lines
                 ) {
                if(word.contains(Integer.toString(i))){
                    stringBuilder.append(word + " ");
                }
            }
        }
        return stringBuilder.toString();
    }
}
