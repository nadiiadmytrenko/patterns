package structural;

public class SimpleRemote extends Remote {
    public SimpleRemote(Device d) {
        super(d);
    }

    @Override
    public void toggle() {
        device.setEnabled();
    }
}