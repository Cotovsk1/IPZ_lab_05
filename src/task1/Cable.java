package task1;

/**
 * Represents a cable in a network.
 * <p>
 * Each cable has a name, a length (in meters) and a price-per-meter. Visitors
 * can visit this element to perform operations such as cost calculation or display.
 */
public class Cable implements NetworkElement{
    private String name;
    private double length;
    private double pricePerMeter;

    /**
     * Create a Cable instance.
     *
     * @param name the cable identifier
     * @param length length in meters
     * @param pricePerMeter cost per meter
     */
    public Cable(String name, double length, double pricePerMeter) {
        this.name = name;
        this.length = length;
        this.pricePerMeter = pricePerMeter;
    }

    /**
     * Get the cable length in meters.
     *
     * @return length in meters
     */
    public double getlength() {return length;}

    /**
     * Get the price-per-meter for this cable.
     *
     * @return price per meter
     */
    public double getpricePerMeter() {return pricePerMeter;}

    /**
     * Get the cable name/identifier.
     *
     * @return cable name
     */
    public String getname() {return name;}

    /**
     * Accept a Visitor to perform an operation on this element.
     *
     * @param visitor the visitor instance
     */
    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
