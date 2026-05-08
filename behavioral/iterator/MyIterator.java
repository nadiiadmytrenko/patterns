package behavioral.iterator;
public class MyIterator {
    private String[] items = {"Елемент 1", "Елемент 2"};
    private int pos = 0;
    public boolean hasNext() { return pos < items.length; }
    public String next() { return items[pos++]; }
}
