package creational;

public class AnimalFactory {
    public static String createAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) return "Пес каже: Гав!";
        if (type.equalsIgnoreCase("Cat")) return "Кіт каже: Мяу!";
        return "Невідома тварина";
    }
}
