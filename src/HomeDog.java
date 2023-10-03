import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeDog {
    public List<Dog> dogs;

    public HomeDog() {
        dogs = new ArrayList<>();
    }

    public void addDogs()
    {
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите кол-во собак");
        int num = Integer.parseInt(vvod.nextLine());
        for (int i = 0; i < num; i++)
        {
            String a = vvod.nextLine();
            String b = vvod.nextLine();
            dogs.add(new Dog(Integer.parseInt(a), b));
        }
    }


}

