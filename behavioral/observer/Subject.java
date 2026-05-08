package behavioral.observer;
import java.util.*;
public class Subject {
    private List<String> subs = new ArrayList<>();
    public void add(String n) { subs.add(n); }
    public void sendNotifications() { subs.forEach(s -> System.out.println(s + " сповіщений.")); }
}
