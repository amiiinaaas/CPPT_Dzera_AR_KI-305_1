package KI305.Dzera.Lab4;

/**
 * Метод реалізації класу для обчислення виразу ctg(x)) / sin(7x-1))
 * @author Amina
 * @version 1.0
 */
public class Equations
{
    /**
     * Метод обчислює вираз ctg(x) / sin (7x-1)
     *
     * @param x кут у градусах
     * @throws CalcException CalcException у випадку, якщо виникають виняткові ситуації під час обчислення
     * @return результат розрахунку
     */
    public double calculate(double x) throws CalcException
    {
        double y;
        double sinValue = 0;
        double rad = x * Math.PI / 180.0; //переводимо x в радіани

        try
        {
            //double xInRadians = Math.toRadians(x);
            sinValue = Math.sin(7 * Math.toRadians(x) - 1);
            y = (1.0/Math.tan(rad)/sinValue);

            //якщо результат не є числом, то генеруємо виключення
            if (Double.isNaN(y) || Double.isInfinite(y) || Double.isInfinite(-y) || x == 90 || x == -90)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex)
        {
            // створимо виключення вищого рівня з поясненням причини виникнення помилки
            if (x==90 || x==-90)
                throw new CalcException("Exception reason: Illegal value of X for tg calculation");
            else if (sinValue == 0) {
                throw new CalcException("Exception reason: sin(7x-1) = 0");
            } else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }
        return y;
    }
}