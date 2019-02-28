package com.sam.algopractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class StringManipulator {

    public static final String SPACE = " ";

    public String reverseWordsInSentence(String sentence) {
        return Arrays.stream(sentence.split(SPACE)).map(word ->
        {
            StringBuilder sb = new StringBuilder(word);
            return SPACE + sb.reverse().toString();
        }).collect(joining());
    }

    public boolean isPallindrome(String word) {
        return reverseWordsInSentence(word).trim().equals(word);
    }


    /**
     * A string is said to be an anagram if it contains same characters and same length but in different order e.g. army and Mary
     *
     * @param first
     * @param second
     * @return true/false
     */
    public boolean isAnagram(String first, String second) {
        char[] charArray1 = first.toCharArray();
        char[] charArray2 = second.toCharArray();
        if(charArray1.length != charArray2.length){
            throw new LengthUnequalException("The two words are of unequal length, hence obviously not anagrams!!");
        }
        List<Character> charList1 = new ArrayList<>();
        List<Character> charList2 = new ArrayList<>();
        for(Character c:charArray1){
            charList1.add(c);
        }
        for(Character c:charArray2){
            charList2.add(c);
        }
        return charList1.stream().sorted().collect(toList())
                .equals(charList2.stream().sorted().collect(toList()));
    }

}