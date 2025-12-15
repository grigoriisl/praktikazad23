public class Main {
    public static void main(String[] args) {
        Product laptop = new Product("Ноутбук Honor", 75999.99);
        Product mouse = new Product("Мышка Razer", 3599.99);
        Product keyboard = new Product("Клавиатура Reddragon", 3099.99);
        Product headphones = new Product("Наушники Sennheiser", 9999.99);
        Cart cart = new Cart();
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);
        cart.addProduct(headphones);
        cart.printCart();
        System.out.println("Удаляем: Мышка Razer");
        cart.removeProduct("Мышка Razer");
        System.out.println("Удаляем: Наушники Sennheiser");
        cart.removeProduct("Наушники Sennheiser");
        cart.printCart();
    }
}