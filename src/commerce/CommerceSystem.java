package commerce;

public class CommerceSystem {
    private String name;
    private String price;
    private String exp;
    private int stock;

    CommerceSystem(String name, String price, String exp, int stock) {
        this.name = name;
        this.price = price;
        this.exp = exp;
        this.stock = stock;
    }
    @Override
    public String toString() {
        return name + " | " + price + " | " + exp + " | " + stock;
    }
}

