package KI305.Dzera.Lab6;

/**
 * Клас CargoBox представляє товарний ящик вантажу для зберігання на судні. Реалізує інтерфейс CargoItem,
 * надаючи змогу отримати назву ящика та його об'єм.
 */
public class CargoBox implements CargoItem {
    private String name; // назва товарного ящика
    private int volume; // об'єм товарного ящика

    /**
     * Конструктор класу CargoBox.
     *
     * @param name   назва товарного ящика
     * @param volume об'єм товарного ящика в кубічних метрах
     */
    public CargoBox(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    /**
     * Реалізація методу інтерфейсу CargoItem для отримання об'єму товарного ящика.
     *
     * @return об'єм товарного ящика в кубічних метрах
     */
    @Override
    public int getVolume() {
        return volume;
    }

    /**
     * Реалізація методу інтерфейсу CargoItem для виведення інформації про товарний ящик.
     */
    @Override
    public void displayInfo() {
        System.out.println("Cargo Box: " + name + ", Volume: " + volume + " cubic meters");
    }
}