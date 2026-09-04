// Импортируем класс ArrayList из пакета java.util,
// чтобы можно было создавать списки.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Создаём новый пустой список строк.
        // ArrayList<String> — список только для текста.
        // cities — имя переменной.
        // new ArrayList<>() — создаёт сам объект списка.
        ArrayList<String> cities = new ArrayList<>();

        // Метод add добавляет элемент в конец списка.
        cities.add("Москва");   // добавляем строку "Москва"
        cities.add("Кострома"); // добавляем строку "Кострома"
        cities.add("Сочи");     // добавляем строку "Сочи"

        // Выводим размер списка (сколько элементов внутри)
        System.out.println("Размер списка: " + cities.size());

        // Цикл for-each перебирает все элементы списка по порядку
        for (String city : cities) {
            // city по очереди принимает значение каждого города
            System.out.println(city);
        }
    }
}