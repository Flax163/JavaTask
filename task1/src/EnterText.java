/**
 * Created by admin on 17.03.2017.
 */
import java.util.Scanner;
class Student{
    
}
public class EnterText {
    public static void main(String[] args)
    {
        Student st = new Student();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = in.nextLine();
        System.out.println(text);
    }
}
