package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 6, 4, 7));
        getOddNumbers(nums);
        System.out.println();
        getEvenNumbers(nums);
        String text = "во поле березка стояла во поле кудрявая стояла";
        getListOfRepeatedWords(text);
        System.out.println();
        getListOfRepeatedWordsNumber(text);
    }

    private static void getListOfRepeatedWordsNumber(String text) {
        List<String> wordsAll = new ArrayList<String>(List.of(text.split(" ")));
        Map<String, Integer> wordsRepeatedNumber = new HashMap<>(Map.of());
        for (int i = 0; i < wordsAll.size(); i++) {
            String word = null;
            int c = 1;
            for (int j = i + 1; j < wordsAll.size(); j++) {
                if (wordsAll.get(i).contains(wordsAll.get(j))) {
                    word = wordsAll.get(i);
                    wordsAll.remove(j);
                    c++;
                }
            }
            if (c > 1) {
                wordsRepeatedNumber.put(word, c);
            }
        }
        System.out.println(wordsRepeatedNumber.toString());
    }

    private static void getListOfRepeatedWords(String text) {
        List<String> wordsAll = new ArrayList<String>(List.of(text.split(" ")));
        Set<String> wordsRepeated = new HashSet<>(List.of());
        for (int i = 0; i < wordsAll.size(); i++) {
            for (int j = i + 1; j < wordsAll.size(); j++) {
                if (wordsAll.get(i).contains(wordsAll.get(j))) {
                        wordsRepeated.add(wordsAll.get(i));
                }
            }
        }
        System.out.println(wordsRepeated.toString());
    }

    private static void getEvenNumbers(List<Integer> nums) {
        Set<Integer> numberEven = new HashSet<Integer>(List.of());
        numberEven.addAll(nums);
        int b = 100;
        List<Integer> numbers = new ArrayList<>();
        for (Integer integer : numberEven) {
            int a = integer % 2;
            if (a == 0) {
                numbers.add(integer);
            }
        }
        Collections.sort(numbers);
        System.out.println(numbers.toString());
    }

    private static void getOddNumbers(List<Integer> nums) {
        for (Integer num : nums) {
            int a = num % 2;
            if (a == 1) {
                System.out.print(num + ", ");
            }
        }
    }


}
