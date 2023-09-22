/**
 * Пакет, що містить класи для лабораторних робіт.
 */
package com.lab;

import java.io.*;
import java.util.*;
import java.io.FileWriter;

/**
 * Цей клас представляє приклад програми для лабораторної роботи №1.
 * 
 * @author Amina Dzera
 * @version 1.1
 * @since 1.0
 */

public class Lab1 {

    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args аргументи командного рядка (не використовуються)
     * @throws IOException виникає, якщо виникають помилки вводу/виводу при роботі з файлом
     */

    public static void main(String[] args) throws IOException {
        // код методу main
        System.out.println("Enter the size of the square matrix: ");
        Scanner scanIn = new Scanner(System.in);
        //int size = scanIn.nextInt();
        int size;

        // введення розміру матриці та перевірка на коректність
        while  (true)
        {
            try
            {
                size =  scanIn.nextInt();  //вводимо розмір матриці з клавіатури
                if (size < 3) //перевіряємо чи наша матриця є більшої розмірності ніж 3
                {
                    System.out.print("The size of the matrix is less than 3! Repeat the input\n"); //якщо ні то виводимо відповідний текст і просимо повторити ввід
                    size = scanIn.nextInt();
                    scanIn.nextLine();
                }
                break;
            }
            catch (Exception e)
            {
                System.out.println("Incorrect input of int. Please, try again. ");
                System.out.println("Enter the size of the square matrix:\t");
                scanIn.nextLine();
            }
        }
        scanIn.nextLine();


        String filler;
        System.out.println("Enter fill character: ");
        filler = scanIn.nextLine();

        char[][] arr = new char[size][];
        for (int i = 0; i < size; i++) {
            arr[i] = new char[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (filler.length() == 1) {
                    arr[i][j] = filler.charAt(0);
                } else if (filler.isEmpty()) {
                    System.out.println("You haven't entered character. Enter fill character: ");
                    filler = scanIn.nextLine();
                    break;
                } else {
                    System.out.println("Fill character must be ONE character. Enter fill character: ");
                    filler = scanIn.nextLine();
                    break;
                }
            }

        }

        //створюємо масив з вказаним користувачем розміром і заповнюємо згідно варіанту
        char[][] matrix = new char[size][];
        for (int i = 0; i < size; i++) {
            int rowLength = i < size / 2 ? i + 1 : size - i;
            matrix[i] = new char[rowLength];
            Arrays.fill(matrix[i], '\t');
            for (int j = 0; j < rowLength; j++) {
                matrix[i][j] = filler.charAt(0);
            }
            if (i == size / 2) {
                Arrays.fill(matrix[i], '+');
            }

        }

       /*
        char[][] matrix = new char[size][];
        for (int i = 0; i < size; i++) {
            matrix[i] = new char[size]; // Ініціалізуємо кожний рядок знову
            Arrays.fill(matrix[i], '\t'); // Заповнюємо рядок символами табуляції
            for (int j = 0; j < size; j++) {
                if (i >= j && i + j <= size - 1) {
                    matrix[i][j] = filler.charAt(0);
                }
            }
        }*/


            // виведення отриманої матриці(масиву) на екран
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Перехід на новий рядок після кожного рядка матриці
        }


        // запис результату в файл 'MyFile.txt'
        FileWriter fileWriter = new FileWriter("MyFile.txt");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                fileWriter.write(matrix[i][j] + "\t");
            }
            fileWriter.write("\n");
        }

        // закриття файлу та завершення роботи програми
        scanIn.close();
        fileWriter.flush();
        fileWriter.close();
        System.out.println("Matrix was written to file 'MyFile.txt'");

    }
}