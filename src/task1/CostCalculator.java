package task1;

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
        // Нічого — рекурсія в accept() зробила всю роботу
    }

    public double getTotalCost() {
        return totalCost;
    }
}