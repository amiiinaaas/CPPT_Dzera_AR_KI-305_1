package KI305.Dzera.Lab4;

import java.util.Scanner;
import java.io.*;

/**
 * Клас CalcExeption головний клас програми для обчислення виразу та запису результату у файл
 * @author Amina
 * @version 1.0
 */

public class ClassException {

    /**
     * Основний метод програми, основна початкова точка програми
     */
    public static void main(String[] args){
        try{
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fileName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fileName));
            try {
                Equations eq = new Equations();
                System.out.println("Enter X in degrees ");
                double res = eq.calculate(in.nextDouble());
                System.out.println("ctg(x) / sin (7x-1) = " +  res);
                fout.print(res);

            } catch (CalcException ex) {
                //блок перехоплює помилки обчислень виразу
                System.out.println(ex.getMessage());
            } finally {
                //цей блок виконається за будь-яких обставин
                fout.flush();
                fout.close();
            }
        } catch (FileNotFoundException ex) {
            //блок перехоплює помилки роботи з файлом навіть якщо вони виникли у блоці finally
            System.out.println("Exception reason: Perhaps wrong file path");
        }
    }
}