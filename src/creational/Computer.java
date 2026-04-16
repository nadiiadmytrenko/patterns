package creational;

public class Computer {
    private String CPU;
    private String RAM;
public static class Builder {
private Computer computer = new Computer();
 public Builder setCPU(String cpu) {
computer.CPU = cpu;
return this;
        }
public Builder setRAM(String ram) {
computer.RAM = ram;
return this;
        }
 public Computer build() {
return computer;
        }
    }
 @Override
    public String toString() {
        return "Builder: Конфігурація ПК [CPU=" + CPU + ", RAM=" + RAM + "]";
    }
}
