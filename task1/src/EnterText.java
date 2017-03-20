/**
 * Created by admin on 17.03.2017.
 */
import java.util.Scanner;
import group.*;
import student.*;
public class EnterText {
    public static void main(String[] args)
    {
        Group gr = new Group();
        Student st = new Student();

        // просит ввести текст и выводит его
        Scanner in = new Scanner(System.in);
        System.out.println("Для добавления студента введите - 1" + "\n" + "Для добавления группы введите - 2");
        String number = in.nextLine();
        switch (number){
            case "1":
                System.out.println("Введите студента");
                break;
            case "2":
                System.out.println("Введите группу");
                break;
        }
    }
}
