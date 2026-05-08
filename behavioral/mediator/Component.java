package behavioral.mediator;
public class Component {
    private Mediator m;
    public Component(Mediator m) { this.m = m; }
    public void send() { m.log("Сигнал від компонента"); }
}