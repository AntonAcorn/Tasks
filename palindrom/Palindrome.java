package palindrom;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "Мир озарим и разорим!";
        System.out.println(palindrom(palindrome));
    }

    static boolean palindrom(String string) {
        string = string.replaceAll("[^а-яА-Яa-zA-Z]", "");
        string = string.toLowerCase();
        System.out.println(string);

        int start = 0;
        int end = string.length() - 1;
        while (start < end){
            if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
       return true;
    }
}

