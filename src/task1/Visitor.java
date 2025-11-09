package task1;

public interface Visitor {
    void visit(Cable cable);
    void visit(Server server);
    void visit(Workstation workstation);
    void visit(Network network);
}
