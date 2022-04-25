import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        System.out.println("Підніматися чи Спускатися?");
        Scanner scanner_two = new Scanner(System.in);
        String number_2 = scanner_two.nextLine();

        System.out.println("Виберіть поверх який хочете відвідати :");
        Scanner scanner_one = new Scanner(System.in);
        int a = scanner_one.nextInt();
        if (number_2.equals("Підніматися")) {
            if (a > 9 || a < 1) {
                System.out.println("Ви вказали не існуючий поверх");
            } else if (a == 2) {
                System.out.println("Нажаль на даний момент ліфт не піднімається на 2 поверх");
                System.out.println("Піднімаємося на 3 поверх");

            } else if (a == 1) {
                System.out.println("Не можна підніматися на перший поверх");

            } else System.out.println("Піднімаємося на " + a + " поверх");
        }

        if (number_2.equals("Спускатися")) {
            if (a > 9 || a < 1) {
                System.out.println("Ви вказали не існуючий поверх");
            } else if (a == 2) {
                System.out.println("Нажаль зараз ліфт не Спускається на 2 поверх");
                System.out.println("Спускаємося на 1 поверх");
            } else if (a == 9) {
                System.out.println("Не можна Спускатися на девятий поверх");
            } else System.out.println("Спускаємося на " + a + " поверх");

        }
    }
}