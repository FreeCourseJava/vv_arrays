package main.java;

/*      Создать массив интов, заполнить его значениями Integer.MIN_VALUE.
        Поменять какие-то значения в массиве.
        Посчитать сколько элементов массива не равны Integer.MIN_VALUE.
        Таким образом получим сколько элементов менялось от первоначального.*/

import java.util.Arrays;

public class ChangesCounter {
    public static void main(String[] args) {
        int numberOfElements = 10;
        int numberOfChanges = 0;

        int[] array = new int[numberOfElements];

        for (int i=0; i<numberOfElements; i++) {
            array[i] = Integer.MIN_VALUE;
        }

        array[0] = 1;
        array[5] = 2;
        array[7] = 3;

        for (int i=0; i<numberOfElements; i++) {
            if (array[i] != Integer.MIN_VALUE) {
                numberOfChanges++;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(numberOfChanges + " elements in the array have been modified");
    }
}
