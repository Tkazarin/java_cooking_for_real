import java.util.*;

import static java.util.Collections.shuffle;


public class task_2
{
    public static String[] magic(String[] word)
    {
        for (int i = 0; i < (word.length/2); i++)
        {
            String let;
            let = word[i];
            word[i] = word[word.length - i - 1];
            word[word.length - i - 1] = let;
        }
        return word;
    }

    public static void printarr(String[] word)
    {
        for (String el: word)
        {
            System.out.print(el + " ");
        }
    }

    public static void Poker()
    {
        Scanner in = new Scanner (System.in);
        String[] mast = {"hapy red", "sad red", "hapy black", "sad black"};
        String[] znach = {"2", "3", "4", "5", "6", "7", "8", "9", "V", "D", "K", "T"};
        int n;
        n = in.nextInt();
        List<String> koloda = new ArrayList<>();
        for (String m: mast)
        {
            for (String z: znach)
            {
                koloda.add(m + " " + z);
            }
        }
        Collections.shuffle(koloda);
        int k = 0;
        for (int i = 0; i < n*5; i++)
        {
            if (k == 4)
            {
                System.out.println(koloda.get(i));
                k = 0;
            }
            else
            {
                System.out.print(koloda.get(i) + " | ");
                k++;
            }
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Задача 1");
        Author me = new Author("Lesha", "tkazarin@gmail.ru", 'n');
        System.out.println(me.to_string());

        System.out.println("Задача 8");
        Scanner vvod = new Scanner (System.in);
        String[] testik = {"So Ill whine", "And Ill moan", "And Ill cry on the phone", "Till i finally drive you away"};
        System.out.println("Оригинальный массив: ");
        printarr(testik);
        testik = magic(testik);
        System.out.println();
        System.out.println("Неригинальный массив: ");
        printarr(testik);

        System.out.println();
        System.out.println("Задача 9");
        Poker();
    }
}
