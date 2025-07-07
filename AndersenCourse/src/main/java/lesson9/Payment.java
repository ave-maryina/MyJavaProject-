package lesson9;

public class Payment {
    private Item[] items;
    private int count;

    public Payment(int itemNumber) {
        this.items = new Item[itemNumber];
        count = 0;
    }

    public class Item {
        private String name;
        private double price;
        private int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }
    }

    public void addItem(String name, double price, int quantity) {
        if (count < items.length) {
            items[count++] = new Item(name, price, quantity);
        }
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < count; i++) {
            total += items[i].price * items[i].quantity;
        }
        return total;
    }

    public void printItemsInfo() {
        for (Payment.Item item : items) {
            System.out.println(item.name + " - price: " + item.price + "; quantity: " + item.quantity);
        }
    }
}
