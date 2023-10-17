package KI305.Dzera.Lab5;

/**
 * Клас CalcException представляє виняток, який може виникнути при виконанні операцій калькулятора.
 * Цей клас є підкласом класу ArithmeticException і дозволяє визначити власні повідомлення про помилки.
 */
class CalcException extends ArithmeticException{
    /**
     * Конструктор без параметрів. Створює новий об'єкт CalcException з порожнім повідомленням про помилку.
     */
    public CalcException(){

    }

    /**
     * Конструктор з параметром. Створює новий об'єкт CalcException зі зазначеним повідомленням про помилку.
     *
     * @param cause Повідомлення про причину виникнення помилки.
     */
    public CalcException(String cause)
    {
        super(cause);
    }
}
