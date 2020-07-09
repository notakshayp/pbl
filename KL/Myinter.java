interface Myinter {
    void connect();

    void disconnect();
}

class OracleDB implements Myinter {
    public void connect() {
        System.out.println("connect to oracle");
    }

    public void disconnect() {
        System.out.println("disconnect to oracle");
    }
}

class Sybase implements Myinter {

    public void connect() {
        System.out.println("connect to sysbase");
    }

    public void disconnect() {
        System.out.println("disconnect to sybase");
    }
}
