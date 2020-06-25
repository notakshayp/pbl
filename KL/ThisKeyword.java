class Sample {
    private int i = 0;
    private int y = 0;

    Sample() {
        this(22);
        this.get();
    }

    Sample(int i) {
        this.i = i;

    }

    void get() {
        System.out.println(i);
    }

    void set(int i) {
        this.i = i;
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Sample s = new Sample();
        // s.set(2121);
        s.get();

    }
}