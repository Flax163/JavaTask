/**
 * Created by admin on 17.03.2017.
 */
import java.util.Scanner;
class Students{

}
class Group{

}
public class EnterText {
    public static void main(String[] args)
    {
        // создаю сущности
        Students st = new Students();
        Group gr = new Group();
        // просит ввести текст и выводит его
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = in.nextLine();
        System.out.println(text);
    }
}
