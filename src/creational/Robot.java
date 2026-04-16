package creational;

public abstract class Robot implements Cloneable {
    public String model;
public abstract void work();
 @Override
    public Object clone() throws CloneNotSupportedException {
     return super.clone();
    }
}
class WorkerRobot extends Robot {
 public WorkerRobot() {
  this.model = "Модель X-1";
    }
 @Override
 public void work() {
 System.out.println("Prototype: Робот " + model + " виконує роботу.");
    }
}
