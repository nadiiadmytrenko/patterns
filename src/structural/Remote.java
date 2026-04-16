package structural;

public abstract class Remote {
    protected Device device;

    public Remote(Device d) {
        this.device = d;
    }

    public abstract void toggle();
}