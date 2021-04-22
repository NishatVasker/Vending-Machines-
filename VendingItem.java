//// Nishat Vasker
//// ID: 2020-2-60-209
//// Sec: 07
//// Assaignment: 01


public class VendingItem {

    private String name;
    private double price;
    private String type;


    public VendingItem(){
        this.type = type;
        this.name = name;

    }

    public VendingItem(String name, String type, double price){

        this.name = name;
        this.type = type;
        this.price = price;

    }

    public double getPrice(){
        return this.price;
    }

    public String toString(){
        return this.name+":"+this.price;
    }

    public String getName(){
        return this.name;
    }

    public String getType() {
        return null;    }
}
