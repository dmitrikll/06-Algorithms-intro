package HW06;

import java.util.Arrays;

public class Main {

    static double[] productPrices;
    static double averagePrice;

    public static void main(String[] args) {

        productPrices = new double[]{456.22, 123.57, 223.89, 375.44, 189.99, 200.13, 312.65};
        System.out.println("\nI. Non-sorted array: \n" + Arrays.toString(productPrices));

        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < productPrices.length - 1; i += 1) {
                if (productPrices[i] > productPrices[i + 1]) {
                    double temp = productPrices[i];
                    productPrices[i] = productPrices[i + 1];
                    productPrices[i + 1] = temp;
                    unsorted = true;
                }
            }
        }

        double sum = 0;
        for (double price : productPrices) {
            sum += price;
        }

        averagePrice = sum / productPrices.length;

        System.out.println("\nII. Sorted array by bubble sort: \n" + Arrays.toString(productPrices) +
                "\n\nIII. The average value of the array is: " + String.format("%.2f", averagePrice));
    }
}





