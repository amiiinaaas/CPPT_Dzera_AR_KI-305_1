package KI305.Dzera.Lab3;

import java.io.IOException;

/**
 * Клас, що представляє ноутбук.
 * Ноутбук є підкласом класу Computer та імплементує інтерфейс LaptopInterface
 *
 * @author Amina
 * @version 1.0
 */
public class Laptop extends Computer implements LaptopInterface{
    private Battery battery;

    /**
     * Конструктор для створення об'єкта ноутбука
     *
     * @throws IOException виняток, який може виникнути при створенні об'єкта
     */
    public Laptop() throws IOException{
        super();
        this.battery = new Battery("Lithium-io");

    }

    /**
     * Метод для включення ноутбука
     *
     * @throws IOException виняток, який може виникнути при включенні ноутбука
     */

    @Override
    public void turnOn() throws IOException{
        super.turnOn();
        System.out.println("Laptop is booting...");
    }

    /**
     * Метод для вимикання ноутбука
     *
     * @throws IOException виняток, який може виникнути при вимиканні ноутбука
     */
    @Override
    public void turnOff() throws IOException {
        super.turnOff();
        System.out.println("Laptop is shutting down...");

    }

    /**
     * Метод для використання батареї ноутбука.
     * Перевіряє рівень заряду батареї та споживає енергію в залежності від умов
     */
    @Override
    public void useBattery() {
        int currentBatteryLevel = battery.getCurrentLevel();
        boolean isCharging = battery.isCharging();

        if (!isCharging) {
            //якщо ноутбук не заряджається, то споживайте енергію
            int energyConsumption = calculateEnergyConsumption();
            currentBatteryLevel -= energyConsumption;

            System.out.println("Battery Level: " + currentBatteryLevel + "%");

            // перевірка на те чи не стало заряду дуже низьким
            if (currentBatteryLevel < 10) {
                System.out.println("Low battery! Save your work and charge the laptop.");
            }
        }
    }

    /**
     * Метод для зарядження батареї ноутбука
     */
    public void chargeBattery() {
        battery.chargeBattery();
    }

    /**
     * Метод для розрядки батареї ноутбука
     *
     * @param energyConsumed кількість спожитої енергії
     */
    public void dischargeBattery(int energyConsumed) {
        battery.dischargeBattery(energyConsumed);
    }

    /**
     * Розрахунок споживаної енергії ноутбуком
     *
     * @return кількість спожитої енергії
     */
    private int calculateEnergyConsumption() {
        // споживання енергії в залежності від виконуваних завдань і активності (повертаємо припустиме значення споживаної енергії)
        return 5;
    }


    /**
     * Клас, що представляє батарею ноутбука
     */
    public class Battery {
        private String type;
        private int currentLevel; //поточний рівень заряду
        private boolean charging; //заряджається комп чи ні

        /**
         * Конструктор для створення об'єкта батареї
         *
         * @param type тип батареї
         */
        public Battery(String type) {
            this.type = type;
            this.currentLevel = 100;
            this.charging = false; //на початку батарея не заряджається
        }

        /**
         * Отримання типу батареї
         *
         * @return тип батареї
         */
        public String getType() {
            return type;
        }

        /**
         * Отримання поточного рівня заряду батареї
         *
         * @return поточний рівень заряду батареї в процентах
         */
        public int getCurrentLevel() {
            return currentLevel;
        }

        /**
         * Перевірка, чи батарея заряджається
         *
         * @return `true` якщо батарея заряджається, `false` в іншому випадку
         */
        public boolean isCharging() {
            return charging;
        }

        /**
         * Метод для зарядження батареї.
         * Перевіряє, чи батарея не заряджається вже і чи не досягла вона максимального рівня заряду
         */
        public void chargeBattery() {
            if (!charging && currentLevel < 100) {
                charging = true;
                System.out.println("Battery is now charging.");
            }
        }

        /**
         * Метод для розрядки батареї ноутбука.
         * Перевіряє, чи батарея не заряджається, і віднімає спожиту енергію від рівня заряду
         *
         * @param energyConsumed кількість спожитої енергії
         */
        public void dischargeBattery(int energyConsumed) {
            if (!charging) {
                currentLevel -= energyConsumed;
                if (currentLevel < 0) {
                    currentLevel = 0;
                    System.out.println("Battery is now fully discharged.");
                }
            }
        }
    }
}
