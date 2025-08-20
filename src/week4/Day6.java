package week4;

import java.util.Arrays;

public class Day6 {

    public static Product productMaximizer(int[] arr) {

        System.out.println("Day6.productMaximizer");

        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Please provide an array with an at least two elements");
        }

        int biggest = 0;
        int bigger = 0;

        for (int i : arr) {

            if (i > biggest) {
                bigger = biggest;
                biggest = i;
            } else {
                bigger = Math.max(i, bigger);
            }
        }

        return new Product(new int[]{bigger, biggest}, bigger * biggest);

    }

    public static void main(String[] args) {

        System.out.println(productMaximizer(new int[]{9, 9, 2, 1, 3, 5, 2}));

    }

    public static class Product {

        private final int[] inputs;
        private final int max;

        public Product(int[] inputs, int max) {
            this.inputs = inputs;
            this.max = max;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "inputs=" + Arrays.toString(inputs) +
                    ", max=" + max +
                    '}';
        }
    }

}
