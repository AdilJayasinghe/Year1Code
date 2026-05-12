public class Main2 {
    public static void main(String[] args) {
        Drink d1 = new Drink("Magarita",3200);
        Drink d2 = new Drink("Beer",3200);
        Drink d3 = new Drink("Juice",3200);

        Order R1= new Order(d1,10);

        System.out.print(R1.printReceipt());
    }
}
