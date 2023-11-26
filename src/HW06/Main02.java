package HW06;

import java.util.Arrays;

public class Main02 {

    static double[] productPrices;
    static double averagePrice;

    public static void main(String[] args) {

        productPrices = new double[]{456.22, 123.57, 223.89, 375.44, 189.99, 200.13, 312.65};
        System.out.println("\nI. Non-sorted array: \n" + Arrays.toString(productPrices));

        for (int i = 0; i < productPrices.length; i += 1) {
            for (int j = 1; j < productPrices.length - i; j += 1) {
                if (productPrices[j - 1] > productPrices[j]) {
                    double temp = productPrices[j - 1];
                    productPrices[j - 1] = productPrices[j];
                    productPrices[j] = temp;
                }
            }
        }

        double sum = 0;
        for (double price : productPrices) {
            sum += price;
        }

        averagePrice = sum / productPrices.length;

        System.out.println("\nII. Sorted array by bubble sort: \n" + Arrays.toString(productPrices) +
                "\n\nIII. The average price for the period is: " + String.format("%.2f", averagePrice) + "EUR");
    }
}