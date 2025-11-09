package task1;

/**
 * Visitor implementation that computes the total monetary cost of the network.
 *
 * This visitor accumulates costs from Servers, Workstations and Cables. The
 * Network traversal is performed by the composite `Network` via its accept().
 */
public class CostCalculator implements Visitor {
    private double totalCost = 0.0;

    @Override
    public void visit(Cable cable) {
        totalCost += cable.getlength() * cable.getpricePerMeter();
    }

    @Override
    public void visit(Server server) {
        totalCost += server.getCost();
    }

    @Override
    public void visit(Workstation workstation) {
        totalCost += workstation.getCost();
    }

    @Override
    public void visit(Network network) {
        // Nothing — recursion in accept() already visits children
    }

    /**
     * Get the accumulated total cost after traversal.
     *
     * @return total cost as double
     */
    public double getTotalCost() {
        return totalCost;
    }
}