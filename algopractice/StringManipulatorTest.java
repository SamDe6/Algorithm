package com.sam.algopractice;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StringManipulatorTest {
    private StringManipulator stringManipulator = new StringManipulator();

    @Test
    public void reverseWordsInSentence() {
    }

    @Test
    public void test_pallindrome_positive() {
        assertThat(stringManipulator.isPallindrome("malayalam"), is(true));
    }

    @Test
    public void test_pallindrome_negative() {
        assertThat(stringManipulator.isPallindrome("sam"), is(false));
    }

    @Test
    public void test_isAnagram() {
        assertThat(stringManipulator.isAnagram("word", "wdodr"),is(true));
    }
}