public class Eight {
    public static void main(String[] args) {
        char code = args[0].toCharArray()[0];
        String color = "";
        switch (code) {
            case 'R': {
                color = "Red";
                break;
            }
            case 'B': {
                color = "Blue";
                break;

            }
            case 'G': {
                color = "Green";
                break;

            }
            case 'O': {
                color = "Orange";
                break;

            }
            case 'Y': {
                color = "Yellow";
                break;

            }
            case 'W': {
                color = "White";
                break;

            }

            default:
                break;
        }
        System.out.println(color);
    }
}