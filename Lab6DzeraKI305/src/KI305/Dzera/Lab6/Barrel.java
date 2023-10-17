package KI305.Dzera.Lab6;

/**
 * Клас Barrel представляє бочку вантажу для зберігання на судні. Реалізує інтерфейс CargoItem,
 * надаючи змогу отримати вміст бочки та її об'єм.
 */
public class Barrel implements CargoItem {
    private String content; // вміст бочки
    private int volume; // об'єм бочки

    /**
     * Конструктор класу Barrel.
     *
     * @param content вміст бочки
     * @param volume об'єм бочки в кубічних метрах
     */
    public Barrel(String content, int volume) {
        this.content = content;
        this.volume = volume;
    }

    /**
     * Отримує вміст бочки.
     *
     * @return вміст бочки
     */
    public String getContent() {
        return content;
    }

    /**
     * Реалізація методу інтерфейсу CargoItem для отримання об'єму бочки.
     *
     * @return об'єм бочки в кубічних метрах
     */
    @Override
    public int getVolume() {
        return volume;
    }

    /**
     * Реалізація методу інтерфейсу CargoItem для виведення інформації про бочку.
     */
    @Override
    public void displayInfo() {
        System.out.println("Barrel with " + content + ", volume: " + volume + " cubic meters.");
    }
}