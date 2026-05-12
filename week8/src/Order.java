public class Order {
    private Drink drink;
    private int quantity;

    public Order(Drink drink, int quantity) {
        this.drink = drink;
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return drink.getPrice() * quantity;
    }

    public String printReceipt(){
        return (drink.getName()+" " + quantity + "=" +  getTotalCost());
    }
}
