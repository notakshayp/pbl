public class StaticBlocks {
    static {
        System.out.println("Static B outside 1 main");
    }

    // public static void main(String[] args) {
    // System.out.println("Inside");
    // }

    static {
        System.out.println("Static B outside 2 main");
    }

}