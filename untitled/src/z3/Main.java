public class Main {
    public static void main(String[] args) {
        StringArrayManager manager = new StringArrayManager();
        manager.add("яблоко");
        manager.add("банан");
        manager.add("помело");
        manager.add("груша");
        manager.add("слива");
        System.out.println("Элементы в порядке возрастания длины:");
        for (int i = 0; i < manager.size(); i++) {
            System.out.println(manager.get(i) + " (длина: " + manager.get(i).length() + ")");
        }
        System.out.println("\nМаксимальный элемент: " + manager.getMax());
        System.out.println("Средняя длина: " + manager.getAverageLength());
        manager.add("a");
        manager.add("watermelon");
        System.out.println("\nПосле добавления новых элементов:");
        for (int i = 0; i < manager.size(); i++) {
            System.out.println(manager.get(i));
        }
        System.out.println("\nМаксимальный элемент: " + manager.getMax());
        System.out.println("Средняя длина: " + manager.getAverageLength());
    }
}