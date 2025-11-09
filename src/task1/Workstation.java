package task1;

public class Workstation implements NetworkElement{
    private String name;
    private double cost;

    public Workstation(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public double getCost() { return cost; }
    public String getName() { return name; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
