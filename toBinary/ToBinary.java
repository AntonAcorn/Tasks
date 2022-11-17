package toBinary;

import java.util.List;

public class ToBinary {
        public static void main(String[] args) {
            List<Integer> list = List.of(1,1,1,1);
            System.out.println(ConvertBinaryArrayToInt(list));
        }
        public static int ConvertBinaryArrayToInt(List<Integer> binary) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Integer x : binary
            ) {
                stringBuilder.append(x);
            }
            System.out.println(stringBuilder.toString());
            int result = Integer.parseInt(String.valueOf(stringBuilder), 2);
            return result;
        }
    }
