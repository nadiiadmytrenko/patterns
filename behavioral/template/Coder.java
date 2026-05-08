package behavioral.template;
public class Coder extends Worker {
    void prep() { System.out.println("Підготовка: вмикаю IDE."); }
    void process() { System.out.println("Процес: пишу код."); }
}