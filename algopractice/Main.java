package com.sam.algopractice;

import java.util.Scanner;

public class Main {

    private static StringManipulator stringManipulator;

    public static void main(String[] args) {
        System.out.print("Write something: ");
        Scanner read = new Scanner(System.in);
        String sentence = read.nextLine();

        stringManipulator = new StringManipulator();
        System.out.println("All words in reverse order:" + stringManipulator.reverseWordsInSentence(sentence));
//        System.out.println("Is it Pallindrome? " + stringManipulator.isPallindrome(sentence));
        System.out.println("Are the two words anagrams? "+ stringManipulator.isAnagram("word","orwd"));
    }
}
