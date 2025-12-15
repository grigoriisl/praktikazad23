public class Cart {
    private Product[] products;
    private int size;
    public Cart() {
        products = new Product[10];
        size = 0;
    }
    public void addProduct(Product p) {
        ensureCapacity();
        products[size] = p;
        size++;
    }
    private void ensureCapacity() {
        if (size == products.length) {
            Product[] newArray = new Product[products.length * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = products[i];
            }
            products = newArray;
        }
    }
    public void removeProduct(String name) {
        for (int i = 0; i < size; i++) {
            if (products[i].getName().equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[size - 1] = null;
                size--;
                break;
            }
        }
    }
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += products[i].getPrice();
        }
        return total;
    }
    public void printCart() {
        System.out.println("=== Корзина ===");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + products[i]);
        }
        System.out.println("Итого: " + String.format("%.2f", getTotal()) + " руб.\n");
    }
}