package ParsingStringAndCountingSum;

public class StringToSum {
    public static void main(String[] args) {
        System.out.println(countString("12345"));


    }

    public static int countString(String str) {
        int value;
        try {
            value = Integer.parseInt(str);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        int sum = 0;
        while (value != 0) {
            sum = sum + value % 10;
            value = value / 10;
        }
        return sum;
    }
}
