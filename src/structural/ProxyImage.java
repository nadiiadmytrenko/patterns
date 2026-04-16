package structural;

public class ProxyImage implements Image {
    private RealImage real;

    @Override
    public void display() {
        if (real == null) {
            real = new RealImage();
        }
        System.out.println("Логування доступу...");
        real.display();
    }
}