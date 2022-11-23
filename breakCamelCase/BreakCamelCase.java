package breakCamelCase;

import java.util.stream.Stream;

//Complete the solution so that the function will break up camel casing, using a space between words.
//Example
//"camelCasing"  =>  "camel Casing"
//"identifier"   =>  "identifier"
//""             =>  ""
public class BreakCamelCase {
    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));


    }
    public static String camelCase(String input) {
        if(input.length() == 0){
            return null;
        }
        String result = "";
        char [] character = input.toCharArray();
        for (int i = 0; i < character.length-1; i++) {
            result = result + character[i];
            if(Character.isUpperCase(character[i+1])){
                result = result + " ";
            }
        }
        result = result + character[input.length()-1];
        return result;
    }
}