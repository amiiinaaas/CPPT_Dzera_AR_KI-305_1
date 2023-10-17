package KI305.Dzera.Lab2;

/**
 * Клас, що представляє оперативну пам'ять комп'ютера (RAM)
 */
public class RAM {
    private final int capacity; // oбсяг оперативної пам'яті в ГБ
    private static int count = 0;

    /**
     * Конструктор класу RAM. Ініціалізує об'єкт оперативної пам'яті з заданим обсягом
     *
     * @param capacity обсяг оперативної пам'яті в ГБ
     */
    public RAM(int capacity) {
        this.capacity = capacity;
        if (capacity > 2) {
            count++;
        }
    }

    /**
     * Статичний метод, що повертає кількість створених об'єктів RAM з обсягом пам'яті більше 2 ГБ
     *
     * @return кількість об'єктів RAM з обсягом пам'яті більше 2 ГБ
     */
    public static int getCount() {
        return count;
    }

    /**
     * Метод, що повертає обсяг оперативної пам'яті поточного об'єкта RAM
     *
     * @return обсяг оперативної пам'яті в ГБ
     */
    public int getCapacity() {
        return capacity;
    }


    /**
     * Отримує доступний обсяг оперативної пам'яті
     *
     * @return обсяг доступної оперативної пам'яті в ГБ
     */
    public int getAvailableMemory() {
        return capacity;
    }
}