class one {
    int i;

    one(int i) {

        this.i = i;
    }
}

class two extends one {
    int i;

    two(int a, int b) {
        super(a);
        i = b;
    }
}

public class ParameterConstructor {
    public static void main(String[] args) {

    }
}