package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 6, 4, 7));
        getOddNumbers(nums);
        System.out.println();
        getEvenNumbers(nums);
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
