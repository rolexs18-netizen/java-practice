public class Main {

    public static void main(String[] args) {
        int x = 17;
        int y = 5;
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        String s1 = "Привет";// литерал, кладётся в пул строк
        String s2 = new String("Привет");// новый объект, отдельная память

        System.out.println(s1 == s2);      // false, потому что разные объекты
        System.out.println(s1.equals(s2)); // true, потому что текст одинаковый
    }
}