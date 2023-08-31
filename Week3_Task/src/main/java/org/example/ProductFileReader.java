package org.example;

import entity.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductFileReader {
    public static void main(String[] args) {
        String fileName = "/Users/mac/Desktop/Java Project/Week3_Task/src/main/resources/ProductList.csv";
        List<Product> productList = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] lineArray = line.split(",");
                String name = lineArray[0];
                int quantity = Integer.parseInt(lineArray[1].trim());
                double price = Double.parseDouble(lineArray[2].trim());

                Product product = new Product(name, quantity, price);
                productList.add(product);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(productList);
    }
}
