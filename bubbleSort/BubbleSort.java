package bubbleSort;
public class BubbleSort {
    public static void main(String[] args) {
        int [] array = new int []{4,3,7,0,5,2,3,5,7,8,};
        int temp;
        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1; j++){
                if (array [j] > array[ j+1]){
                    temp = array[j];
                    array [j] = array [j +1];
                    array [j+1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

    }
}
