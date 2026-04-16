package structural;

public class Adapter implements USB {
    private MicroUSB micro;

    public Adapter(MicroUSB micro) {
        this.micro = micro;
    }

    @Override
    public void connect() {
        micro.connectMicro();
    }
}