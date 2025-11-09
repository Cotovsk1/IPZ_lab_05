package task1;

/**
 * Common interface for elements that can be part of a network.
 *
 * Implementing classes represent leaves (Server, Workstation, Cable) or
 * composites (Network). Each element accepts a Visitor to allow external
 * operations without modifying the element classes.
 */
public interface NetworkElement {
    void accept(Visitor visitor);
}
