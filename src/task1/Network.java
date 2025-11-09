package task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite representing a network or sub-network.
 *
 * A Network contains other NetworkElement instances (Servers, Workstations, Cables,
 * or nested Networks). It implements accept() to allow Visitor traversal.
 */
public class Network implements NetworkElement{
    private String name;
    private List<NetworkElement> elements = new ArrayList<>();

    /**
     * Create a network with a human-readable name.
     *
     * @param name network name
     */
    public Network(String name) {
        this.name = name;
    }

    /**
     * Add a child element to this network.
     *
     * @param element child element
     */
    public void addElement(NetworkElement element){
        elements.add(element);
    }

    /**
     * Remove a child element from this network.
     *
     * @param element child element to remove
     */
    public void removeElement(NetworkElement element){
        elements.remove(element);
    }

    /**
     * Get the network name.
     *
     * @return name string
     */
    public String getName() { return name; }

    /**
     * Get the list of child elements.
     *
     * @return modifiable list of NetworkElement
     */
    public List<NetworkElement> getElements() { return elements; }

    /**
     * Accept a Visitor. The visitor will be applied to this network and then
     * recursively to all child elements.
     *
     * @param visitor visitor instance
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (NetworkElement element : elements) {
            element.accept(visitor);
        }
    }
}
