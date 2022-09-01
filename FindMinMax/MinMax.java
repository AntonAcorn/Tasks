package FindMinMax;
public class MinMax{
    public static void main(String[] args) {
        int n = 25;
        double [] array = new double[n];

        for (int i = 0; i < n; i++){
            array [i] = Math.random()*1000;
        }

        double min = array[0];
        double max = array[0];
        double avg = 0;
        double sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
            sum = sum + array[i];
            avg = sum / array.length;
        }
        System.out.format("Максимальное значение: " + "%.1f \n", max);
        System.out.format("Минимальное значение: %.1f \n", min);
        System.out.format("Среднее значение: %.1f", avg);
    }
}

