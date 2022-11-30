public class MyTestBasket {
    public static void main(String[] args) {
        BasketStore basketOnlineStore = new BasketStore();
        basketOnlineStore.addProduct("product1", 10);
        basketOnlineStore.addProduct("product2", 20);
        basketOnlineStore.addProduct("product3", 30);
        basketOnlineStore.addProduct("product4", 40);

        for (String product : basketOnlineStore.getProducts()) {
            System.out.println(product + " " + basketOnlineStore.getProductQuantity(product));
        }
        System.out.println(basketOnlineStore.getProducts());

        basketOnlineStore.removeProduct("product4");
        basketOnlineStore.updateProductQuantity("product1", 777);

        for (String product : basketOnlineStore.getProducts()) {
            System.out.println(product + " " + basketOnlineStore.getProductQuantity(product));
        }
        System.out.println(basketOnlineStore.getProducts());
    }
}
