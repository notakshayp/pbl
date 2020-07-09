abstract class calculator {
    abstract int calculate(int a, int b);
}

class add extends calculator {
    int calculate(int a, int b) {
        return a + b;
    }
}

class sub extends calculator {
    int calculate(int a, int b) {
        return a - b;
    }
}

class Abstract {
    public static void main(String[] args) {
        add a = new add();
        sub b = new sub();
        System.out.println(a.calculate(5, 5));
        System.out.println(b.calculate(5, 5));
    }
}