package KI305.Dzera.Lab3;

import java.io.IOException;

/**
 * Клас `LaptopApp` є демонстраційним додатком, який ілюструє використання функціональності ноутбука.
 *
 * Даний додаток створений для тестування та виконання різних операцій на ноутбуці
 */
public class LaptopApp {
    public static void main(String[] args){
        try{
            Laptop laptop = new Laptop();

            laptop.turnOn();
            laptop.performCalculations();
            laptop.isHardDriveHealthy();
            laptop.checkHardDriveStatus();
            laptop.storeData("Some important data");
            laptop.useBattery();
            laptop.chargeBattery();
            laptop.checkAvailableMemory();
            laptop.launchApplication("Microsoft Exel");
            laptop.changeMonitorSettings(80,70);
            laptop.clickMouseLeftButton();
            laptop.scrollMouseDown();
            laptop.pressKeyOnKeyboard('Q');
            laptop.typeTextOnKeyboard("Have a good day!");
            laptop.dischargeBattery(10);
            laptop.useBattery();

            Software software1 = new Software("Google Drive");
            Software software2 = new Software("Adobe Illustrator");
            laptop.installSoftware(software1);
            laptop.installSoftware(software2);

            laptop.turnOff();
            laptop.closeLogFile();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}