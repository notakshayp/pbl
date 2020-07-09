class Sample {
    static void demo() {
        try {
            System.out.println("inside demo");
            throw new NullPointerException("exception data");
        } catch (NullPointerException ne) {
            System.out.println(ne);
        }

    }
}

class throwDemo {
    public static void main(String[] args) {
        Sample.demo();
    }
}