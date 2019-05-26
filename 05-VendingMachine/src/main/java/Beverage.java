import java.util.Objects;

public class Beverage {

    private String name;
    private int price;

    public Beverage(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beverage)) return false;
        Beverage beverage = (Beverage) o;
        return getPrice() == beverage.getPrice() &&
                getName().equals(beverage.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }
}
