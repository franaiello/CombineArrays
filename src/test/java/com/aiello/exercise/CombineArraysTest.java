package com.aiello.exercise;

import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CombineArraysTest {

    @Test
    public void combineArraysIntoOne() {
        Integer[] array = CombineArrays.combineIntegerArrays(new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6});
        assertThat(array).containsExactly(new Integer[]{1, 2, 3, 4, 5, 6});
    }

    @Test
    public void combineUnEvenArraysIntoOne() {
        Integer[] array = CombineArrays.combineIntegerArrays(new int[]{1, 2, 3}, new int[]{4}, new int[]{5, 6, 7, 8});
        assertThat(array).containsExactly(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
    }

    @Test
    public void combineStringArrays() {
        String[] array = CombineArrays.combineStringArrays(new String[]{"a", "b"}, new String[]{"c", "d"}, new String[]{"e", "f"});
        assertThat(array).containsExactly(new String[]{"a", "b", "c", "d", "e", "f"});
    }

    @Test
    public void combineUnevenLengthStringArrays() {
        String[] array = CombineArrays.combineStringArrays(new String[]{"a", "b"}, new String[]{"c", "d", "e", "f"}, new String[]{"g"});
        assertThat(array).containsExactly(new String[]{"a", "b", "c", "d", "e", "f", "g"});
    }

}
