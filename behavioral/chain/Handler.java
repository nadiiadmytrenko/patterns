package behavioral.chain;
public interface Handler {
    void setNext(Handler n);
    void handle(String t);
}
