package lesson6;

public class User {
    /**
     * 1. Single Responsibility Principle:
     * Класс User выполняет одну задачу: хранит минимальные атрибуты пользователя - имя и фамилия.
     * 2. Open Closed Principle:
     * Класс User содержит параметры, доступ к которым ограничен модификатором private.
     * Для добавления новой фукциональности был создан класс-наследник Student,
     * который добавляет новую функциональность к классу User.
     */
    private String firstName;
    private String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
