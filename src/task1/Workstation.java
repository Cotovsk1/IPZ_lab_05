package task1;

/**
 * Represents a workstation (a client machine) in the network.
 *
 * A workstation has a name and a monetary cost. It implements NetworkElement
 * so visitors can operate on it (for example, to compute total cost or display).
 */
public class Workstation implements NetworkElement{
    private String name;
    private double cost;

    /**
     * Construct a workstation.
     *
     * @param name human-readable name
     * @param cost monetary cost of the workstation
     */
    public Workstation(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Get the cost of the workstation.
     *
     * @return cost as double
     */
    public double getCost() { return cost; }

    /**
     * Get the workstation name.
     *
     * @return name string
     */
    public String getName() { return name; }

    /**
     * Accept a Visitor to perform an operation on this workstation.
     *
     * @param visitor visitor to handle this element
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
