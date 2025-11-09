package task1;

public class Cable implements NetworkElement{
    private String name;
    private double length;
    private double pricePerMeter;

    public Cable(String name, double length, double pricePerMeter) {
        this.name = name;
        this.length = length;
        this.pricePerMeter = pricePerMeter;
    }

    public double getlength() {return length;}
    public double getpricePerMeter() {return pricePerMeter;}
    public String getname() {return name;}

    @Override
    public void accept(Visitor visitor){
        visitor.visit(this);
    }

}
