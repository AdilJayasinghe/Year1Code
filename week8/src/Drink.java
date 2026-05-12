public class Drink {
    private String name;
    private double price;

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    //setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
    }
}
