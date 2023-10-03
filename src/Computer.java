public class Computer {
    private String brand;
    private String model;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public String to_String() {
        return brand + " " + model;
    }

    public String getBrand()
    {
        return this.brand;
    }

    public String getModel()
    {
        return this.model;
    }
}
