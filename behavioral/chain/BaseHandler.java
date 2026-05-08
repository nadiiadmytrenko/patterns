package behavioral.chain;
public class BaseHandler implements Handler {
    private Handler next;
    private String name;
    public BaseHandler(String n) { this.name = n; }
    public void setNext(Handler n) { this.next = n; }
    public void handle(String t) {
        if (t.contains(name)) System.out.println(name + " виконав запит.");
        else if (next != null) next.handle(t);
    }
}