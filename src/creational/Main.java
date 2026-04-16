package creational;
import structural.*;

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
 System.out.println("\n 7. Adapter ");
        // Створюємо адаптер, щоб підключити MicroUSB через звичайний USB
        USB adapter = new Adapter(new MicroUSB());
        adapter.connect();

        System.out.println("\n 8. Bridge ");
        Remote remote = new SimpleRemote(new TV());
        remote.toggle();

        System.out.println("\n 9. Composite ");
        Composite root = new Composite();
        root.add(new Leaf()); // Додаємо "файлик" у "папку"
        root.show();

        System.out.println("\n 10. Decorator ");
        Coffee myCoffee = new MilkDecorator(new SimpleCoffee());
        System.out.println(myCoffee.getDesc()); // Виведе: Кава з молоком

        System.out.println("\n 11. Facade ");
        CarFacade car = new CarFacade();
        car.startCar(); // Одна кнопка запускає і двигун, і світло

        System.out.println("\n 12. Flyweight ");
        // Отримуємо тип дерева з кешу
        TreeFactory.getType("Дуб").draw();

        System.out.println("\n 13. Proxy ");
        Image image = new ProxyImage();
        image.display(); // Завантажить і покаже картинку
    }
}
