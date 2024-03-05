package sample01;

public class MessageBeanImpl implements MessageBean {
    private String fruit;
    private int cost;
    private int qty;

    // Constructor with two arguments
    public MessageBeanImpl(String fruit, int cost) {
        this.fruit = fruit;
        this.cost = cost;
    }

    // Getter and setter methods for the fields

    @Override
    public void sayHello() {
        // Implementation
    }

    @Override
    public void sayHello(String fruit, int cost) {
        // Implementation
    }

    @Override
    public void sayHello(String fruit, int cost, int qty) {
        System.out.println(fruit + "\t" + cost + "\t" + qty);
    }
}
