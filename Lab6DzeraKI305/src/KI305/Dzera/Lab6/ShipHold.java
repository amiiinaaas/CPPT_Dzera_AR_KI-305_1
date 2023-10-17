package KI305.Dzera.Lab6;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас ShipHold представляє трюм судна для зберігання вантажу. Він може містити об'єкти
 * класу, який розширює клас CargoItem.
 *
 * @param <T> тип вантажу, який можна зберігати в трюмі, розширює клас CargoItem
 */
public class ShipHold<T extends CargoItem> {
    private List<T> items; // список для зберігання вантажу

    /**
     * Конструктор класу ShipHold. Ініціалізує пустий список для зберігання вантажу.
     */
    public ShipHold() {
        items = new ArrayList<>();
    }

    /**
     * Додає вантаж до трюму.
     *
     * @param item вантаж, який додається до трюму
     */
    public void placeItem(T item) {
        items.add(item);
    }

    /**
     * Видаляє та повертає останній доданий вантаж з трюму.
     *
     * @return вантаж, який був видалений з трюму, або null, якщо трюм пустий
     */
    public T removeItem() {
        if (!items.isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            return null;
        }
    }

    /**
     * Знаходить та повертає вантаж з найбільшим об'ємом в трюмі.
     *
     * @return вантаж з найбільшим об'ємом в трюмі, або null, якщо трюм пустий
     */
    public T findMaxItem() {
        if (!items.isEmpty()) {
            T max = items.get(0);
            for (T item : items) {
                if (item.getVolume() > max.getVolume()) {
                    max = item;
                }
            }
            return max;
        } else {
            return null;
        }
    }

    /**
     * Підраховує кількість вантажу з певним вмістом в трюмі.
     *
     * @param content вміст, який шукається у вантажі
     * @return кількість вантажу з вказаним вмістом в трюмі
     */
    public int countItemsByContent(String content) {
        int count = 0;
        for (T item : items) {
            if (item instanceof Barrel) {
                Barrel barrel = (Barrel) item;
                if (barrel.getContent().equals(content)) {
                    count++;
                }
            }
        }
        return count;
    }
}