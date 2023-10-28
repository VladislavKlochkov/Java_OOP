package lesson7.hw;

public class ComplexNumbersOperations implements ICalculationOperations<ComplexNumber> {

    @Override
    public ComplexNumber addition(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(
                number1.getRe() + number2.getRe(),
                number1.getIm() + number2.getIm());
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(
                number1.getRe() - number2.getRe(),
                number1.getIm() - number2.getIm());
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(
                number1.getRe() * number2.getRe() - number1.getIm() * number2.getIm(),
                number1.getRe() * number2.getIm() + number1.getIm() * number2.getRe());
    }

    @Override
    public ComplexNumber division(ComplexNumber number1, ComplexNumber number2) {
        return new ComplexNumber(
                (number1.getRe() * number2.getRe() + number1.getIm() * number2.getIm())
                        / (number2.getRe() * number2.getRe() + number2.getIm() * number2.getIm()),
                (number1.getIm() * number2.getRe() - number1.getRe() * number2.getIm())
                        / (number2.getRe() * number2.getRe() + number2.getIm() * number2.getIm()));
    }
}
