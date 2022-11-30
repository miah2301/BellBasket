public class MyTestBasket {
    public static void main(String[] args) {
        BasketStore basketStore = new BasketStore();
        basketStore.addProduct("product1", 10);
        basketStore.addProduct("product2", 20);
        basketStore.addProduct("product3", 30);
        basketStore.addProduct("product4", 40);

        for (String product : basketStore.getProducts()) {
            System.out.println(product + " " + basketStore.getProductQuantity(product));
        }
        System.out.println(basketStore.getProducts());

        basketStore.removeProduct("product4");
        basketStore.updateProductQuantity("product1", 777);

        for (String product : basketStore.getProducts()) {
            System.out.println(product + " " + basketStore.getProductQuantity(product));
        }
        System.out.println(basketStore.getProducts());
    }
}
