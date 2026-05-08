package behavioral.memento;
public class Memento {
    private String state;
    public Memento(String s) { this.state = s; }
    public String get() { return state; }
}