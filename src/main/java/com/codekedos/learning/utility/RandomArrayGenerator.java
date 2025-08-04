package com.codekedos.learning.utility;

import net.datafaker.Faker;

import java.util.Random;

public class RandomArrayGenerator {

    private static final Faker faker = new Faker();
    private static final Random random = new Random();

    // Generate array of random Integers within a range
    public static Integer[] getRandomIntegers(int size, int min, int max) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < size; i++) {
            array[i] = faker.number().numberBetween(min, max + 1);
        }
        return array;
    }

    // Generate array of random Floats within a range
    public static Float[] getRandomFloats(int size, float min, float max) {
        Float[] array = new Float[size];
        for (int i = 0; i < size; i++) {
            array[i] = min + random.nextFloat() * (max - min);
        }
        return array;
    }

    // Generate array of random Strings (names by default)
    public static String[] getRandomStrings(int size) {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = faker.name().fullName();
        }
        return array;
    }

    // Utility to print array
    public static <T> void printArray(T[] array) {
        for (T val : array) {
            System.out.println(val);
        }
    }
}
