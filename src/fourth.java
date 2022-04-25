
import java.util.Scanner;

public class fourth{
    public static void main(String[] args) {
        System.out.println("Введіть символи 'Так', 'ОК', 'Yes', 'Y', '+', 'Ok','Ні', 'NO', 'N', '-', 'No' ");
        Scanner scanner = new Scanner(System.in);
        String set = scanner.nextLine();
        switch (set){
            case "Так", "OK", "Yes", "Y", "+", "Ok" :
                System.out.println("Я погоджуюся!");
                break;
            case "Ні", "NO", "N", "-", "No":
                System.out.println("Я відмовляюся!");
                break;
            default:
                System.out.println("Ви вели не вірне значення");
        }
    }
}