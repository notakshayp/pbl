public class Nine {
    public static void main(String[] args) {
        int code = Integer.parseInt(args[0]);
        String month = "";
        switch (code) {
            case 1: {
                month = "jan";
                break;
            }
            case 2: {
                month = "feb";
                break;

            }
            case 3: {
                month = "mar";
                break;

            }
            case 4: {
                month = "apr";
                break;

            }
            case 5: {
                month = "may";
                break;

            }
            case 6: {
                month = "jun";
                break;

            }
            case 7: {
                month = "jul";
                break;

            }
            case 8: {
                month = "aug";
                break;

            }
            case 9: {
                month = "sep";
                break;

            }
            case 10: {
                month = "oct";
                break;

            }
            case 11: {
                month = "nov";
                break;

            }
            case 12: {
                month = "dec";
                break;

            }

            default: {
                month = "Invalid";
                break;

            }
        }
        System.out.println(month);
    }
}