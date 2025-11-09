package task1;

public class DisplayVisitor implements Visitor{
    private int indent = 6;

    private void printIndent(String message) {
        for (int i = 0; i < indent; i++) {
            System.out.print("  ");
        }
        System.out.println(message);
    }

    @Override
    public void visit(Cable cable) {
        printIndent("Cable: " + cable.getname());
    }

    @Override
    public void visit(Server server) {
        printIndent("Server: " + server.getName());
    }

    @Override
    public void visit(Workstation workstation) {
        printIndent("Workstation: " + workstation.getName());
    }

    @Override
    public void visit(Network network) {
        System.out.println("Network: " + network.getName());

    }

}
