interface Flyable {
    void fly();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Main {
    public static void main(String[] args) {
        Object object = new Bird();
        if (object instanceof Flyable) {
            Flyable flyable = (Flyable) object;
            flyable.fly();
        }
    }
}
