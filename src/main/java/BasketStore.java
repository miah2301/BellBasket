import java.util.ArrayList;
import java.util.List;

public class BasketStore implements Basket{

    private final List<Product> products = new ArrayList<>();

    @Override
    public void addProduct(String product, int quantity) {
        products.add(new Product(product,quantity));
    }

    @Override
    public void removeProduct(String product) {
        for (int index = 0; index < products.size(); index++) {
            if (products.get(index).getProduct().equals(product)) {
                products.remove(index);
                return;
            }
        }
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        for (Product value : products) {
            if (value.getProduct().equals(product)) {
                value.setProduct(product);
                value.setQuantity(quantity);
                return;
            }
        }
    }

    @Override
    public void clear() {
        products.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> productsList = new ArrayList<>();
        for (Product product : products) {
            productsList.add(product.getProduct());
        }
        return productsList;
    }

    @Override
    public int getProductQuantity(String product) {
        for (Product productQuantity : products) {
            if (productQuantity.getProduct().equals(product)) {
                return productQuantity.getQuantity();
            }
        }
        return 0;
    }
}
