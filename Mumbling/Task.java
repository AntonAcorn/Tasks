package Mumbling;

//accum("abcd") -> "A-Bb-Ccc-Dddd"
//        accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
//        accum("cwAt") -> "C-Ww-Aaa-Tttt"


public class Task {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }

    public static String accum(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String up = s.substring(i, i + 1).toUpperCase();
            String low = s.substring(i, i + 1).toLowerCase();
            res += up;
            for (int j = 1; j <= i; j++) {
                res += low;
            }
            if (i !=s.length()-1){
                res+= "-";
            }
        }
        return res;
    }
}