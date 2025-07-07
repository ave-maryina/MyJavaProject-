package lesson9;

public class PaymentRunner {
    public static void main(String[] args) {
        Payment payment = new Payment(4);
        payment.addItem("pen", 5.99, 2);
        payment.addItem("pencil", 4.1, 3);
        payment.addItem("notebook", 9.1, 1);
        payment.addItem("eraser", 3.97, 1);
        payment.printItemsInfo();
        System.out.println(payment.getTotal());
    }
}
