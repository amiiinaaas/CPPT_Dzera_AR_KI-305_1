package KI305.Dzera.Lab4;

/**
 * Клас CalcException реалізує підклас, який перехоплює арифметичні винятки та надає пояснення, чому це виключення сталося
 *
 * @author Amina
 * @version 1.0
 */
public class CalcException extends ArithmeticException{
    /**
     * Конструктор CalcException()
     */
    public CalcException() {
    }

    /**
     * Конструктор CalcException
     * @param cause пояснювальне повідомлення, пояснює чому стався виняток
     */
    public CalcException(String cause) {
        super(cause);
    }
}