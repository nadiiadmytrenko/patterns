package structural;

public class TV implements Device {
    @Override
    public void setEnabled() {
        System.out.println("ТБ увімкнено");
    }
}