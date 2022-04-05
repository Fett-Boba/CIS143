package com.olympic.cis143.hw1.fizzbuzz;

public class FizzBuzzConverterTest {

    public static void main(String[] args) {
        FizzBuzzConverterTest fizzBuzzConverterTest = new FizzBuzzConverterTest();
        fizzBuzzConverterTest.testOne();
        fizzBuzzConverterTest.testTwo();
    }

    public void testOne() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter(new int[] {3, 15, 20, 7});
        Object[] result = fizzBuzzConverter.convertToFizzBuzz();
        if (!this.equals(result, new Object[] {"Fizz", "FizzBuzz", "Buzz", 7})) {
            throw new RuntimeException("testOne failed");
        }
        System.out.println(">> testOne passed");
    }

    public void testTwo() {
        FizzBuzzConverter fizzBuzzConverter = new FizzBuzzConverter(new int[] {0 ,13, 9, 25, 30});
        Object[] result = fizzBuzzConverter.convertToFizzBuzz();
        if (!this.equals(result, new Object[] {0, 13, "Fizz", "Buzz", "FizzBuzz"})) {
            throw new RuntimeException("testOne failed");
        }
        System.out.println(">> testTwo passed");
    }

    public boolean equals(Object[] result, Object[] expected) {
        if (result == null) {
            return false;
        }
        if (result.length != expected.length) {
            return false;
        }
        for (int i = 0; i < result.length; i++) {
            if (!result[i].equals( expected[i])) {
                return false;
            }
        }
        return true;
    }
}
