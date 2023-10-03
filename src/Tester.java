public class Tester {
    private Circle[] circles;
    private int num;

    public Tester(int mx) {
        circles = new Circle[mx];
        num = 0;
    }

    public void addCircle(Circle circle)
    {
        if (num < circles.length)
        {
            circles[num] = circle;
            num++;
        }
        else
        {
            System.out.println("Массив объектов Circle заполнен.");
        }
    }

    public void print_circles()
    {
        System.out.println("Кружечки");
        for (int i=0; i < this.num; i++)
        {
            System.out.println("Circle №" + i + " " + circles[i].to_String());
        }
    }
}
