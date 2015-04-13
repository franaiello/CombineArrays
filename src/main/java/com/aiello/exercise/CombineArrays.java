package com.aiello.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineArrays {


    /**
     * Method takes two parameters, the first is an integer array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param arrays
     *
     * Example: array [1,2,3,4,5,6]
     *          returns [1,2] [3,4] [5,6]
     */
    public static int[] combineIntegerArrays(int[] ... arrays) {
        List<Integer> list = new ArrayList<Integer>();

        for (int[] array : arrays) {
            for (int i = 0; i <= array.length - 1; i++) {
                list.add(array[i]);
            }
        }

        return convertToIntArray(list);
    }

    private static int[] convertToIntArray(List<Integer> list) {
        int[] array = new int[list.size()];

        int i=0;

        for (Integer value : list) {
            array[i] = value;
            i++;
        }

        return array;
    }

    /**
     * Method takes two parameters, the first is a String array to
     * split apart and the second argument is how many times you want
     * to split up the array into separate individual arrays
     *
     * @param arrays
     * @return
     */
    public static String[] combineStringArrays(String[]... arrays) {
        List<String> list = new ArrayList<String>();

        for (String[] array : arrays) {
            for (int i = 0; i <= array.length - 1; i++) {
                list.add(array[i]);
            }
        }

        return convertToStringArray(list);
    }

    private static String[] convertToStringArray(List<String> list) {
        String[] array = new String[list.size()];

        int i=0;

        for (String value : list) {
            array[i] = value;
            i++;
        }

        return array;
    }
}
