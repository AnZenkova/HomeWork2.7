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
    }

    private static void getListOfRepeatedWords(String text) {
        List<String> wordsAll = new ArrayList<String>(List.of(text.split(" ")));
        List<String> wordsRepeated = new ArrayList<String>(List.of());
        for (int i = 0; i < wordsAll.size(); i++) {
            int c = 0;
            for (int j = i + 1; j < wordsAll.size(); j++) {
                if (wordsAll.get(i).contains(wordsAll.get(j))) {
                    wordsRepeated.add(wordsAll.get(i));
                    c++;
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
