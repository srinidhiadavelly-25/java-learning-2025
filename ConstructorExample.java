public class ConstructorExample {
    String product;
    int price;

    // Constructor
    ConstructorExample(String p, int pr) {
        product = p;
        price = pr;
    }

    void display() {
        System.out.println(product + " - ₹" + price);
    }

    public static void main(String[] args) {
        ConstructorExample item1 = new ConstructorExample("Laptop", 55000);
        ConstructorExample item2 = new ConstructorExample("Mobile", 25000);

        item1.display();
        item2.display();
    }
}
