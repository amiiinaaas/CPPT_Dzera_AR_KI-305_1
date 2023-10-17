package KI305.Dzera.Lab6;

/**
 * Клас ShipHoldDriver є вхідною точкою програми та демонструє використання класів ShipHold, CargoBox і Barrel.
 * Створюється тримач для товарних ящиків та бочок, заповнюється вантажем, рахується кількість бочок з певним
 * вмістом та виводяться інформація про товари з найбільшим об'ємом в тримачі.
 */
public class ShipHoldDriver {
    public static void main(String[] args){
        // Створення та заповнення тримача для товарних ящиків
        ShipHold<CargoBox> cargoBoxHold = new ShipHold<>();
        cargoBoxHold.placeItem(new CargoBox("Electronics", 5));
        cargoBoxHold.placeItem(new CargoBox("Clothes", 2));

        // Створення та заповнення тримача для бочок
        ShipHold<Barrel> barrelHold = new ShipHold<>();
        barrelHold.placeItem(new Barrel("Oil", 2));
        barrelHold.placeItem(new Barrel("Wine", 4));
        barrelHold.placeItem(new Barrel("Oil", 3));
        barrelHold.placeItem(new Barrel("Wine", 5));
        barrelHold.placeItem(new Barrel("Oil", 1));
        barrelHold.placeItem(new Barrel("Oil", 7));

        // Підрахунок кількості бочок з певним вмістом
        int wineBarrelsCount = barrelHold.countItemsByContent("Wine");
        int oilBarrelsCount = barrelHold.countItemsByContent("Oil");

        // Виведення кількості бочок з певним вмістом
        System.out.println("Number of barrels with wine: " + wineBarrelsCount);
        System.out.println("Number of barrels with oil: " + oilBarrelsCount);

        // Пошук та виведення товару з найбільшим об'ємом для товарних ящиків
        CargoBox maxCargoBox = cargoBoxHold.findMaxItem();
        if(maxCargoBox != null){
            System.out.println("Max Cargo Box: ");
            maxCargoBox.displayInfo();
        } else {
            System.out.println("No cargo boxes in the hold.");
        }

        // Пошук та виведення товару з найбільшим об'ємом для бочок
        Barrel maxBarrel = barrelHold.findMaxItem();
        if(maxBarrel != null){
            System.out.println("Max Barrel: ");
            maxBarrel.displayInfo();
        } else {
            System.out.println("No barrels in the hold.");
        }
    }
}