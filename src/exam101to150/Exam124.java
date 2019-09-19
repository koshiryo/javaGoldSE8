package exam101to150;

public class Exam124<K, V> {
    private K key;
    private V value;

    public Exam124(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <T> Exam124<T, T> twice(T value) {
        return new Exam124<T, T>(value, value);
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Exam124<String, Integer> mark = new Exam124<String, Integer>("Steve", 100);         //A
        Exam124<String, String> pair = Exam124.<String>twice("Hello World!");               //B
        Exam124<?, ?> percentage = new Exam124<String, Integer>("Steve", 100);    //C
        Exam124<String, String> grade = new Exam124<>("John", "A");                         //D
    }
}
