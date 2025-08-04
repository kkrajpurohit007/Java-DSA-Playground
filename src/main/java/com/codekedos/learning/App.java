package com.codekedos.learning;

import com.codekedos.learning.utility.RandomArrayGenerator;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Java DSA Playground!");

        Integer[] intArray = RandomArrayGenerator.getRandomIntegers(5, 10, 50);
        Float[] floatArray = RandomArrayGenerator.getRandomFloats(5, 1.5f, 9.9f);
        String[] nameArray = RandomArrayGenerator.getRandomStrings(5);

        System.out.println("🔢 Random Integers:");
        RandomArrayGenerator.printArray(intArray);

        System.out.println("\n🌡️ Random Floats:");
        RandomArrayGenerator.printArray(floatArray);

        System.out.println("\n🧑 Random Names:");
        RandomArrayGenerator.printArray(nameArray);
    }
}