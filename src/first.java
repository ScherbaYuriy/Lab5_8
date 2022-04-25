import java.util.Scanner;

public class first{

    public static void main(String[] args) {
        System.out.println("Ведіть число з проміжку (50 - 100)");
        Scanner one = new Scanner(System.in);
        int a = one.nextInt();
        if(a > 100)
            System.out.println("Число " + a + " не міститься в проміжку(50 - 100)");
        else if (a < 50)
            System.out.println("Число " + a + " не міститься в проміжку(50 - 100)");
        else {
            System.out.println("Число " + a + " міститься в проміжку (50 - 100)");

        }

    }

}