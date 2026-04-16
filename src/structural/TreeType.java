package structural;

public class TreeType {
    private String name;

    public TreeType(String name) {
        this.name = name;
    }

    public void draw() {
        System.out.println("Малюємо дерево: " + name);
    }
}