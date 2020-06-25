class Test {
    static int x = 10;

    static void display() {
        System.out.println(x);
    }
}

class Demo {

    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        ++t1.x;
        Test.display();
        t1.display();
        t2.display();
    }
}