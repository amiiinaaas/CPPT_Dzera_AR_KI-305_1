package KI305.Dzera.Lab5;

import java.io.*;
import java.util.*;

/**
 * Клас FioApp представляє програму для використання класу CalcWFio. Програма демонструє введення
 * даних, їх обробку та збереження результатів у текстовий та бінарний файл, а також читання результатів
 * з цих файлів та їх виведення на екран.
 */
public class FioApp {
    /**
     * Основний метод програми, який виконує введення даних, обробку та збереження результатів у файлі,
     * а також читання результатів з файлів та їх виведення на екран.
     *
     * @param args параметри командного рядка (не використовуються у цій програмі)
     * @throws FileNotFoundException виняток, який виникає, якщо не вдається знайти вказаний файл
     * @throws IOException виняток, який виникає при помилках вводу/виводу під час роботи з файлами
     */
    public static void main (String[] args) throws FileNotFoundException, IOException{
        CalcWFio obj = new CalcWFio();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        obj.calculate(data);
        System.out.println("Result is: " + obj.getResult());
        obj.writeResTxt("textRes.txt");
        obj.writeResBin("BinRes.bin");
        obj.readResBin("BinRes.bin");
        System.out.println("Result is: " + obj.getResult());
        obj.readResTxt("textRes.txt");
        System.out.println("Result is: " + obj.getResult());
    }
}
