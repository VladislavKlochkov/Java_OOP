package lesson6;

import java.util.List;

public interface UserView<T extends User> {
    void print(List<T> listT);
}
/**
 * 4. Interface Segregation Principle:
 * Создан интерфейс в котором определены только методы для отображения используемых методов
 * 5. Dependency Inversion Principle:
 * Создан интерфейс от которого зависят сущности для различных классов
 *
 * @param <T> - класс, пройзводный от User
 */