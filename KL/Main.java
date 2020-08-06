abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("safaf");
    }
}

class test {
    public static void main(String[] args) {
        Shape s = new Circle();
        s->draw();
    }
}