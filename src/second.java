import java.util.Scanner;

public class second {
        public static void main(String[] args) {
                System.out.println("Введіть  тризначне число:");
                Scanner one = new Scanner(System.in);
                int number = one.nextInt();
                int number_1 = number / 100;
                int number_2 = number % 100 / 10;
                int number_3 = number % 10;
                int numbers_1_2 = Math.max(number_1, number_2);
                System.out.println(Math.max(numbers_1_2, number_3));

        }
}
