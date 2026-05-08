package behavioral.memento;
public class Originator {
    private String state;
    public void set(String s) { this.state = s; }
    public Memento save() { return new Memento(state); }
    public void restore(Memento m) { this.state = m.get(); System.out.println("Стан відновлено: " + state); }
}