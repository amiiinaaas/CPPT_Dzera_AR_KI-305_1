package KI305.Dzera.Lab5;

import java.io.*;
import java.util.*;

/**
 * Клас CalcWFio містить методи для розрахунку математичного виразу та зберігання результатів
 * у текстових та бінарних файлах.
 */
public class CalcWFio {

    /**
     * Метод відповідає за запис результату у текстовий файл.
     *
     * @param fName ім'я текстового файлу, в який буде записаний результат
     * @throws FileNotFoundException виняток, який виникає, якщо не вдається знайти вказаний файл
     */
    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f ",result);
        f.close();
    }

    /**
     * Метод відповідає за читання результату з текстового файлу.
     *
     * @param fName ім'я текстового файлу, з якого буде зчитано результат
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + "not found");
            }
        }
        catch (FileNotFoundException ex){
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Метод відповідає за запис результату у бінарний файл.
     *
     * @param fName ім'я бінарного файлу, в який буде записаний результат
     * @throws FileNotFoundException виняток, який виникає, якщо не вдається знайти вказаний файл
     * @throws IOException виняток, який виникає при помилках вводу/виводу під час роботи з файлами
     */
    public void writeResBin(String fName) throws FileNotFoundException, IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    /**
     * Метод відповідає за читання результату з бінарного файлу.
     *
     * @param fName ім'я бінарного файлу, з якого буде зчитано результат
     * @throws FileNotFoundException виняток, який виникає, якщо не вдається знайти вказаний файл
     * @throws IOException виняток, який виникає при помилках вводу/виводу під час роботи з файлами
     */
    public void readResBin(String fName) throws FileNotFoundException, IOException
    {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Метод виконує розрахунок математичного виразу для заданого значення x у градусах.
     *
     * @param x значення x у градусах для розрахунку виразу
     */
    public void calculate(double x) {
        result = ((1.0/Math.tan(x * Math.PI / 180.0))/Math.sin(7 * Math.toRadians(x) - 1));;
    }

    /**
     * Метод повертає результат останнього розрахунку.
     *
     * @return результат розрахунку
     */
    public double getResult() {
        return result;
    }
    private double result; //змінна для збереження результату розрахунку
}
