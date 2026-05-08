package behavioral.visitor;
public class ConsoleVisitor implements Visitor {
    public void visit(String item) { System.out.println("Відвідувач обробив: " + item); }
}
