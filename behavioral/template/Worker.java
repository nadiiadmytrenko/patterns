package behavioral.template;
public abstract class Worker {
    public final void work() { prep(); process(); }
    abstract void prep();
    abstract void process();
}