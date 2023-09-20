import java.util.Scanner;

public class HowMany
{
    public static void main(String[] args)
    {
        System.out.println("Задача 10");
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите предложение: ");
        String input = vvod.nextLine();
        String[] words = input.split(" ");
        System.out.println("Вы ввели " + words.length + " слов.");
        vvod.close();
    }
}
