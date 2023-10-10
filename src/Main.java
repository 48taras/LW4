import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("\uD83D\uDE03");
        System.out.println("\uD83C\uDF0D");
        System.out.println("\uD83C\uDF6A");

        char char1 = (char) (random.nextInt(65535 - 32 + 1) + 32);
        char char2 = (char) (random.nextInt(65535 - 32 + 1) + 32);

        System.out.println("Перший символ: " + char1);
        System.out.println("Другий символ: " + char2);

        if (char1 == char2) {
            System.out.println("Символи рівні.");
        } else {
            System.out.println("Символи не рівні.");
        }
    }
}