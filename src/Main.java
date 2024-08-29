import com.bluecatcode.junit.shaded.org.apache.commons.lang3.ArrayUtils;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        Main.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 1; array[i] < smallest; i++) {
            smallest = array[i];
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                index = i;
            }
        }
        return index;
    }

//    public static int indexOfSmallestFrom(int[] array, int startIndex){
//        int smallest = array[startIndex];
//        for (int i = startIndex+1; array[i] < smallest; i++) {
//            smallest = array[i];
//
//        }
//        int indexOf = ArrayUtils.indexOf(array, smallest);
//        return indexOf;
//    }


//    public static int indexOfSmallestFrom(int[] array, int startIndex){
//        int smallest = array[startIndex];
//        for (int i = startIndex; array[i] < smallest; i++) {
//            smallest = array[i];
//        }
//
//        int index = 0;
//        for(int i =startIndex ; i < array.length; i++ ){
//
//            if(array[i] == smallest){
//                index = i;
//            }
//
//        }
//        return index;
//    }

    public static  int indexOfSmallestFrom(int[] array, int startIndex){
        int smallest = array[startIndex];
        int index =startIndex;
        for(int i = startIndex + 1 ; i < array.length; i++){
            if(array[i] < smallest){
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2){
        int first = array[index1];
        array[index1] = array[index2];
        array[index2] = first;

    }
    public static void sort(int[] array){
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length -1; i++){
           int index =i;
           int smallest = array[i];

           for(int j = i+1; j<array.length; j++){

               if(array[j] < smallest){
                   smallest = array[j];
                   index = j;

               }
           }

           swap(array, i, index );
           System.out.println(Arrays.toString(array));
       }


    }

}


