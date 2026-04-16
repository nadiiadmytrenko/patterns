package structural;

class Engine { void start() { System.out.println("Двигун запущено"); } }
class Lights { void on() { System.out.println("Світло увімкнено"); } }

public class CarFacade {
    private Engine engine = new Engine();
    private Lights lights = new Lights();
    public void startCar() { engine.start(); lights.on(); }
}