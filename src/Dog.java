public class Dog {
    private int age;
    private String name;

    public Dog(int a, String n)
    {
        this.age = a;
        this.name = n;
    }

    public String to_String() {
        return "Dog's name is " + name + " and its age is " + age;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getName()
    {
        return this.name;
    }

    public int humAge()
    {
        return 7*age;
    }
}
