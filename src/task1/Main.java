package task1;

public class Main {
    public static void main(String[] args) {

        Network rootNetwork = new Network("Root network");

        Server server1 = new Server("Server_01", 1000);
        Workstation workstation1 = new Workstation("Workstation_01", 200);
        Cable cable1 = new Cable("Cable_01", 100, 5.0);

        Network subNetwork = new Network("Sub network");
        Workstation workstation2 = new Workstation("Workstation_02", 300);
        Cable cable2 = new Cable("Cable_02", 50, 5.0);


        Workstation workstation3 = new Workstation("Workstation_03", 400);
        Cable cable3 = new Cable("Cable_03", 100, 5.0);

        //-------
        subNetwork.addElement(workstation2);
        subNetwork.addElement(cable2);

        subNetwork.addElement(workstation3);
        subNetwork.addElement(cable3);
        //------
        rootNetwork.addElement(server1);
        rootNetwork.addElement(workstation1);
        rootNetwork.addElement(cable1);
        rootNetwork.addElement(subNetwork);
        //---------------
        CostCalculator costCalculator = new CostCalculator();
        rootNetwork.accept(costCalculator);
        System.out.println("\n");

        DisplayVisitor displayVisitor = new DisplayVisitor();
        rootNetwork.accept(displayVisitor);
        System.out.println("\n");

        System.out.println("Total cost: " + costCalculator.getTotalCost());
        System.out.println("\n");

    }
}
