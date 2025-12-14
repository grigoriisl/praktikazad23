public class StringArrayManager {
    private String[] array;
    private int size;
    public StringArrayManager() {
        array = new String[10];
        size = 0;
    }
    public StringArrayManager(int initialCapacity) {
        array = new String[initialCapacity];
        size = 0;
    }
    public void add(String element) {
        ensureCapacity();
        int insertIndex = size;
        for (int i = 0; i < size; i++) {
            if (element.length() < array[i].length()) {
                insertIndex = i;
                break;
            }
        }
        if (insertIndex != size) {
            System.arraycopy(array, insertIndex, array, insertIndex + 1, size - insertIndex);
        }
        array[insertIndex] = element;
        size++;
    }
    private void ensureCapacity() {
        if (size == array.length) {
            String[] newArray = new String[array.length * 2 + 1];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    public String getMax() {
        return array[size - 1];
    }
    public double getAverageLength() {
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += array[i].length();
        }
        return (double) totalLength / size;
    }
    public int size() {
        return size;
    }
    public String get(int index) {
        return array[index];
    }
}