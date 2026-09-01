// Класс Main — точка входа в программу
public class Main {

    // Метод main — отсюда начинается выполнение
    public static void main(String[] args) {

        // Создаём объект myCar класса Car
        Car myCar = new Car();

        // Задаём полям значения
        myCar.color = "Синий";
        myCar.maxSpeed = 180;

        // Вызываем метод drive()
        myCar.drive();

        // Выводим информацию о машине
        System.out.println("Цвет: " + myCar.color);
        System.out.println("Максимальная скорость: " + myCar.maxSpeed);
    }
}

// Класс Car — шаблон для создания автомобилей
class Car {
    // Поле color — цвет автомобиля
    String color;

    // Поле maxSpeed — максимальная скорость
    int maxSpeed;

    // Метод drive — выводит сообщение
    void drive() {
        System.out.println("Машина едет");
    }
}
