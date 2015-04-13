package com.aiello.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineArrays {

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
