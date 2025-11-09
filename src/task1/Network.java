package task1;

import java.util.ArrayList;
import java.util.List;

public class Network implements NetworkElement{
    private String name;
    private List<NetworkElement> elements = new ArrayList<>();

    public Network(String name) {
        this.name = name;
    }

    public void addElement(NetworkElement element){
        elements.add(element);
    }
    public void removeElement(NetworkElement element){
        elements.remove(element);
    }

    public String getName() { return name; }
    public List<NetworkElement> getElements() { return elements; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (NetworkElement element : elements) {
            element.accept(visitor);
        }
    }
}
