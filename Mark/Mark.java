package Mark;

public class Mark {
    public static void main(String[] args) {
        int a = 4;
        LABEL:
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 4){
                    break LABEL; //выходит из первого цикла, а не из второго, система меток
                }
            }

        }
    }
}
