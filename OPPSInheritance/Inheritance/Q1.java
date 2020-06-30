
class Animal {
    void eat() {
        System.out.println("Animal is eating its food");

    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Bird extends Animal {
    void eat() {
        System.out.println("Bird eats food");
    }

    void sleep() {
        System.out.println("Bird sleeps");
    }

    void fly() {
        System.out.println("Bird fly");
    }
}

public class Q1 {
    public static void main(String[] args) {
        Bird hen = new Bird();
        hen.eat();
        hen.fly();
        hen.sleep();
    }
}