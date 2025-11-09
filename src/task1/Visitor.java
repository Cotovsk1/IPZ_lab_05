package task1;

/**
 * Visitor interface for operations that can be applied to network elements.
 *
 * Implementations perform an operation for each concrete element type.
 */
public interface Visitor {
    /** Visit a Cable element. */
    void visit(Cable cable);
    /** Visit a Server element. */
    void visit(Server server);
    /** Visit a Workstation element. */
    void visit(Workstation workstation);
    /** Visit a Network composite. */
    void visit(Network network);
}
