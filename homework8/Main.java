package homework8;

import lesson9.ArrayServis;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arrayLenght = 20;
        int valueRange = 15;
        Random random = new Random();
        int current = random.nextInt(valueRange);

        int[] array = new int[arrayLenght];

        for (int i = 0; i < arrayLenght; i++) {
            array[i] = random.nextInt(valueRange);
        }
        System.out.println(ArrayServis.linearSerch(array,6));
        System.out.println();

        ArrayServis.bubbleSort(array);
        System.out.println(ArrayServis.binarySearch(array,6));


    }

    }