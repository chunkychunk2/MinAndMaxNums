package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        int numbers[] = get20Num();
        int max = numbers[0];
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static int[] get20Num() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nums[] = new int[20];
        for (int i = 0; i < nums.length; i++)
            nums[i] = Integer.parseInt(reader.readLine());
        return nums;
    }
}
//напишите тут ваш код
