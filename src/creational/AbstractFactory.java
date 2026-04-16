package creational;
interface Chair { void sitOn(); }

class ModernChair implements Chair {
    @Override
    public void sitOn() { System.out.println("Abstract Factory: Ви сіли на сучасний стілець."); }
}
interface FurnitureFactory {
    Chair createChair();
}
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() { return new ModernChair(); }
}
