package task1;

/**
 * Represents a server in the network.
 *
 * Server is a leaf network element with a name and an associated purchase cost.
 */
public class Server implements NetworkElement {
    private String name;
    private double cost;

    /**
     * Create a server instance.
     *
     * @param name identifier for the server
     * @param cost monetary cost
     */
    public Server(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * Get the server cost.
     *
     * @return cost as double
     */
    public double getCost() { return cost; }

    /**
     * Get the server name.
     *
     * @return name string
     */
    public String getName() { return name; }

    /**
     * Accept a Visitor to perform an operation on this server.
     *
     * @param visitor visitor instance
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}