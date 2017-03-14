package algorithms;

import java.util.Random;

/**
 * Created by kirk on 2017/3/13.
 */
public class BubbleSort {
    public static void main(String args[]) {
        int[] arrays= new int[10];
        for (int i = 0; i < 10; i++) {
            Random r = new Random();
            arrays[i]= r.nextInt(100);
            System.out.print(arrays[i]+",");
        }
        int sortedArrays[] = BubbleSort(arrays);
        System.out.println("\n");
        for (int i = 0; i < sortedArrays.length; i++) {
            System.out.print(sortedArrays[i]+",");
        }
    }
    public static int[] BubbleSort(int[] array) {
        for (int j = 0; j < array.length-1; j++) {
            for (int i = 0; i<array.length-1-j; i++) {
                int tmp;
                if (array[i] > array[i + 1]) {
                    tmp = array[i];
                    array[i] = array[i + 1];
                    array[i+1] = tmp;
                }
                System.out.print(array[i]+",");
                if (i == array.length - 2) {
                    System.out.println(array[i+1]);
                }
            }
        }
        return array;
    }
}
