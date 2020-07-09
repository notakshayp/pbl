interface PrinterInter {
    void connect();

    void printIt();

    void disconnect();
}

class HP implements PrinterInter {
    public void connect() {
        System.out.println("Connected to HP");
    }

    public void printIt() {
        System.out.println("Print from HP");

    }

    public void disconnect() {
        System.out.println("Disconnected from HP");

    };
}

class IDK implements PrinterInter {
    public void connect() {
        System.out.println("Connected to IDK");
    }

    public void printIt() {
        System.out.println("Print from IDK");

    }

    public void disconnect() {
        System.out.println("Disconnected from IDK");

    };
}

class PrinterInterface {
    public static void main(String[] args) {
        HP hpPrinter = new HP();
        hpPrinter.connect();
        hpPrinter.printIt();
        hpPrinter.disconnect();

        IDK idkPrinter = new IDK();
        idkPrinter.connect();
        idkPrinter.printIt();
        idkPrinter.disconnect();
    }
}