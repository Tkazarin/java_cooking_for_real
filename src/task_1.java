import java.util.Scanner;
public class task_1 {
    public static int fack(int a)
    {
        int rez = 1;
        for (int i=1; i <= a; i++)
        {
            rez = rez * i;
        }
        return rez;
    }
    public static void main(String[] args)
    {
        Scanner vvod = new Scanner (System.in);

        System.out.println("Задача 3");
        int[] nums = {1, 2, 3};
        int sum = 0;
        for (int i=0; i<nums.length; i++)
        {
            sum += nums[i];
        }
        double av = (double) sum / nums.length;
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + av);

        System.out.println("Задача 4");
        int n=0;
        System.out.print("Введите целое число: ");
        if (vvod.hasNextInt())
        {
            n = vvod.nextInt();
        }
        else
        {
            System.out.print("Ошибочка");
        }
        int[] numss = new int[n];
        int ssum = 0;
        int much = 0;
        int less = 0;
        if (vvod.hasNextInt())
        {
            numss[0] = vvod.nextInt();
            ssum += numss[0];
            much = numss[0];
            less = numss[0];
        }
        else
        {
            System.out.print("Ошибочка");
        }
        int i = 1;
        while(i < n)
        {
            if (vvod.hasNextInt())
            {
                numss[i] = vvod.nextInt();
                ssum += numss[i];
                if (numss[i] > much)
                {
                    much = numss[i];
                }
                if (numss[i] < less)
                {
                    less = numss[i];
                }
            }
            else
            {
                System.out.print("Ошибочка");
            }
            i++;
        }
        System.out.println("Сумма элементов массива: " + ssum);
        System.out.println("Максимальное: " + much);
        System.out.println("Минимальное: " + less);

        System.out.println("Задача 5");
        if (args.length > 0)
        {
            for (int k = 0; k < args.length; k++)
            {
                System.out.println("Аргумент " + (k + 1) + ": " + args[i]);
            }
        }
        else
        {
            System.out.println("Аргументы командной строки отсутствуют.");
        }

        System.out.println("Задача 6");
        int num = 10; // number of values we want in a series
        double result = 0.0;
        System.out.print("Гармонический ряд: ");
        while (num > 1)
        {
            result = result + (double)1 / num;
            num--;
            System.out.printf("%f, ", result);
        }
        result = result + (double)1 / num;
        System.out.printf("%f", result);

        System.out.println();
        System.out.println("Задача 7");
        int f = 0;
        if (vvod.hasNextInt())
        {
            f = vvod.nextInt();
        }
        else
        {
            System.out.print("Ошибочка");
        }
        System.out.println("Факториал числа: " + fack(f));
    }
}
