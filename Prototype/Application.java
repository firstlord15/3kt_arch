package Prototype;

public class Application {
    public static void main(String[] args) {
        Prototype original = new Prototype("Original");
        Prototype clone = original.clone();

        clone.setField("Clone");

        System.out.println(original); // Prototype{field='Original'}
        System.out.println(clone);    // Prototype{field='Clone'}
    }
}