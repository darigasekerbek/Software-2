public class Main {
    public static void main(String[] args) {
        Salesman sm = new Cashier(new ShopAssistant());
        System.out.println(sm.responsibilities());
    }
}