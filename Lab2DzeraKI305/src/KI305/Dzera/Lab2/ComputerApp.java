/**
 * lab 2 package
 */
package KI305.Dzera.Lab2;

import java.io.*;

/**
 * Клас, що містить метод `main`, який представляє собою додаток для використання комп'ютера
 */
public class ComputerApp {

    /**
     * Основний метод програми, який використовує комп'ютер та його компоненти
     *
     * @param args параметри командного рядка (не використовуються у цьому додатку)
     * @throws IOException викидається, якщо виникають проблеми з обробкою введення/виведення
     */
    public static void main (String[] args) throws IOException {
        //cтворення об'єктів для компонентів комп'ютера
        CPU cpu = new CPU("Intel Core i5");
        RAM ram = new RAM(8);
        HardDrive hardDrive = new HardDrive(512);
        Monitor monitor = new Monitor("1920x1080");
        Mouse mouse = new Mouse("Logitech");
        Keyboard keyboard = new Keyboard("QWERTY");

        Computer computer = new Computer(cpu, ram, hardDrive, monitor, mouse, keyboard);
        computer.turnOn();

        //це для завдання для захисту лаб, підрахунок кількості включених комп'ютерів
        Computer computer1 = new Computer(cpu, ram, hardDrive, monitor, mouse, keyboard);
        computer1.turnOn();

        Computer computer2 = new Computer(cpu, ram, hardDrive, monitor, mouse, keyboard);
        computer2.turnOn();

        Computer computer3 = new Computer(cpu, ram, hardDrive, monitor, mouse, keyboard);
        computer3.turnOn();
        System.out.println("Кількість включених комп'ютерів: " + Computer.count);


        computer.performCalculations();
        computer.isHardDriveHealthy();
        computer.checkHardDriveStatus();
        computer.storeData("Some important data");
        computer.setMonitor(new Monitor("2560x1440"));
        computer.checkAvailableMemory();
        computer.launchApplication("Microsoft Exel");
        computer.changeMonitorSettings(80,70);
        computer.clickMouseLeftButton();
        computer.clickMouseRightButton();
        computer.scrollMouseDown();
        computer.scrollMouseUp();
        computer.pressKeyOnKeyboard('Q');
        computer.typeTextOnKeyboard("Have a good day!");

        //отримання та виведення інформації про модель процесора
        String cpuModel = cpu.getModel();
        System.out.println("CPU Model: " + cpuModel);


        //збереження даних на жорсткий диск та отримання інформації про його обсяг
        hardDrive.saveData("This is data about the computer's hard drive.");
        int storageCapacity = hardDrive.getStorageCapacity();
        System.out.println("Hard Drive Capacity: " + storageCapacity + " GB");

        //встановлення та виведення інформації про встановлене програмне забезпечення
        Software software1 = new Software("Google Drive");
        Software software2 = new Software("Adobe Photoshop & Illustrator");
        computer.installSoftware(software1);
        computer.installSoftware(software2);
        computer.showInstalledSoftware();

        //вимкнення комп'ютера та завершення роботи
        computer.turnOff();
        computer.shutdown();


        //це для завдання для захисту лаб, вивід кількості об'єктів RAM з пам'яттю більше 2 ГБ
        RAM ram1 = new RAM(4);
        RAM ram2 = new RAM(8);
        RAM ram3 = new RAM(2);
        RAM ram4 = new RAM(16);
        RAM ram5 = new RAM(1);
        RAM ram6 = new RAM(1);

        System.out.println("Кількість об'єктів RAM з пам'яттю більше 2 ГБ: " + RAM.getCount());

    }

}