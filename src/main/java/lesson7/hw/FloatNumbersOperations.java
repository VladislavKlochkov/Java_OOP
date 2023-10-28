package lesson7.hw;

public class FloatNumbersOperations implements ICalculationOperations<Float> {

    @Override
    public Float addition(Float number1, Float number2) {
        return number1 + number2;
    }

    @Override
    public Float subtraction(Float number1, Float number2) {
        return number1 - number2;
    }

    @Override
    public Float multiplication(Float number1, Float number2) {
        return number1 * number2;
    }

    @Override
    public Float division(Float number1, Float number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        return null;
    }
}
