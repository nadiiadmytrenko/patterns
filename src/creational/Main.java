package creational;

public class Main {
    public static void main(String[] args) throws Exception {
// 1. Singleton
 Singleton.getInstance().showMessage();
// 2. Simple Factory
System.out.println(AnimalFactory.createAnimal("Dog"));
// 3. Factory Method
Creator creator = new PdfCreator();
creator.create().open();
// 4. Abstract Factory
 FurnitureFactory furniture = new ModernFurnitureFactory();
 furniture.createChair().sitOn();
// 5. Builder
 Computer pc = new Computer.Builder().setCPU("Intel i9").setRAM("32GB").build();
 System.out.println(pc);
 // 6. Prototype
 WorkerRobot original = new WorkerRobot();
 WorkerRobot clone = (WorkerRobot) original.clone();
 clone.work();
    }
}
