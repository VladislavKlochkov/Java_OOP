package lesson7.hw;

import java.util.Scanner;

public class Main {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int selectedAction;
        System.out.println("Первое комплексное число: ");
        ComplexNumber number1 = inputComplexNumber();
        System.out.println("Второе комплексное число: ");
        ComplexNumber number2 = inputComplexNumber();
        do {
            System.out.print("Выберите действие: ['+ (сложение)' = 1, " +
                    "'- (вычитание)' = 2, " +
                    "'* (умножение)' = 3, " +
                    "'/ (деление)' = 4 ] : ");
            selectedAction = sc.nextInt();
            if (selectedAction >= 1 && selectedAction <= 4) {
                break;
            } else {
                System.out.println("Такой операции нет. Введите номер от 1 до 4!");
            }
        } while (true);
        System.out.printf("Первое комплесное число = %s\n", number1);
        System.out.printf("Второе комплесное число = %s\n", number2);
        System.out.printf("Операция = %s\n", selectedAction);
        ComplexNumber resultNumber;
        switch (selectedAction) {
            case 1:
                resultNumber = new ComplexNumbersOperations().addition(number1, number2);
                break;
            case 2:
                resultNumber = new ComplexNumbersOperations().subtraction(number1, number2);
                ;
                break;
            case 3:
                resultNumber = new ComplexNumbersOperations().multiplication(number1, number2);
                break;
            case 4:
                resultNumber = new ComplexNumbersOperations().division(number1, number2);
                break;
            default:
                resultNumber = null;
        }

        System.out.println(resultNumber);

    }

    private static ComplexNumber inputComplexNumber() {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Введите действительную часть комплесного числа: ");
        float realPart = inputNumber.nextFloat();
        System.out.print("Введите мнимую часть комлексного числа: ");
        float imaginaryPart = inputNumber.nextFloat();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
