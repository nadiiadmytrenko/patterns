package structural;
import java.util.*;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();
    public void add(Component c) { children.add(c); }
    public void show() { for (Component c : children) c.show(); }
}