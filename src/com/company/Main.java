package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

            letterCombinations("1234566");
    }


    public static List<String> letterCombinations(String digits) {
        String[] numbers = digits.split("");
        String[] numberLetters = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        LinkedList<String> numbersList = new LinkedList<>();
        numbersList.add("");
        for (int i = 0; i <numbers.length ; i++) {
            Integer num = Integer.parseInt(numbers[i]);
            int size = numbersList.size();
            for (int j = 0; j < size ; j++) {
                String temp = numbersList.pop();
                for (int k = 0; k < numberLetters[num].length() ; k++) {
                    numbersList.add(temp + numberLetters[num].charAt(k));
                }
            }
        }
        String result = "";
        for (int i = 0; i <numbersList.size() ; i++) {
            result += numbersList.get(i) + ",";
        }
        System.out.println(result);
        return numbersList;
    }

}
