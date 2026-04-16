package structural;

public class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee c) {
        this.coffee = c;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " з молоком";
    }
}