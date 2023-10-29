package lesson7.hw;

public interface ICalculationOperations<T> {
    T addition(T number1, T number2);

    T subtraction(T number1, T number2);

    T multiplication(T number1, T number2);

    T division(T number1, T number2);
}
