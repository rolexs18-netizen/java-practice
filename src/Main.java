import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(("Привет, я изучаю Java!"));


        int age = 30;
        String name = "Алексей";
        double price = 1200.50;
        boolean isAdmin = true;


        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Цена: " + price);
        System.out.println("Админ?: " + isAdmin);


        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);


        if (age >= 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println("Квадрат: " + (i * i));
        }
        int[] numbers = {5, 10, 15};
        for (int i = 0; i < numbers.length; i++)

            System.out.println("Номер: " + numbers[i]);
        ArrayList<String> cities = new ArrayList<>();

        cities.add("Москва");
        cities.add("Кострома");
        cities.add("Сочи");
        System.out.println("Размер списка: " + cities.size());

        for (String city : cities) {
            System.out.println(city);

        }

    }
}
