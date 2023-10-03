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
        Scanner vvod = new Scanner (System.in);
        System.out.println("Задача 1");
        Author me = new Author("Lesha", "tkazarin@gmail.ru", 'n');
        System.out.println(me.to_string());

        System.out.println("Задача 2");
        Ball ball1 = new Ball(1.0, 2.0);
        System.out.println(ball1.to_String());

        System.out.println("Задача 3");
        Tester p = new Tester(10);
        Circle circ1 = new Circle(10, 3, 4);
        Circle circ2 = new Circle(1, 2, 2);
        p.addCircle(circ1);
        p.addCircle(circ2);
        p.print_circles();

        System.out.println("Задача 4");
        System.out.println("Введите кол-во компьютеров");
        int num = Integer.parseInt(vvod.nextLine());
        Shop Eldorado = new Shop();
        for (int i = 0; i < num; i++)
        {
            String a = vvod.nextLine();
            String b = vvod.nextLine();
            Eldorado.addComputer(new Computer(a, b));
        }
        System.out.println(Eldorado.findComputer("P", "E"));

        System.out.println("Задача 5");
        HomeDog Moskva = new HomeDog();
        Moskva.addDogs();
        System.out.println(Moskva.dogs.get(0).to_String());

        System.out.println("Задача 6");
        System.out.println(circ1.compareCircles(circ2));

        System.out.println("Задача 7");
        Bookshelf shelf = new Bookshelf(5);

        shelf.addBook(new Book("Author 1", "Book 1", 2000));
        shelf.addBook(new Book("Author 2", "Book 2", 1995));
        shelf.addBook(new Book("Author 3", "Book 3", 2010));
        shelf.addBook(new Book("Author 4", "Book 4", 1985));
        System.out.println("Книги до сортировки:");
        shelf.displayBooks();
        shelf.sortBooksByYear();
        System.out.println("\nКниги после сортировки:");
        shelf.displayBooks();

        System.out.println("Задача 8");
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

        HowMany prog = new HowMany();
        prog.main(args);
    }
}
