class fruit {
    String name;
    String taste;
    int size;

    public void eat() {
        System.out.println("tastes like a fruit");
    }
}

class apple extends fruit {
    public void eat() {
        System.out.println("tastes like a apple");
    }
}

class orange extends fruit {
    public void eat() {
        System.out.println("tastes like a orange");
    }
}

public class Q1 {
    public static void main(String[] args) {
        fruit f = new fruit();
        fruit applef = new apple();
        fruit orangef = new orange();
        applef.eat();
        orangef.eat();
        f.eat();
    }

}