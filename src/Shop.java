import java.util.List;
import java.util.ArrayList;
public class Shop {
    private List<Computer> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);
    }

    public boolean findComputer(String brand, String model) {
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand) && computer.getModel().equals(model)) {
                return true;
            }
        }
        return false;
    }
}
