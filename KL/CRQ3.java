class CRQ3 {
    public static void main(String[] args) {
        String str = args[0];
        int num = 0;
        boolean f = true;
        for (int i = 1; i < args.length; i++) {
            if (f) {
                num += Integer.parseInt(args[i]);
                f = false;
            } else {
                num -= Integer.parseInt(args[i]);
                f = true;
            }
        }
        // System.out.println(num);

        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char in = str.charAt(i);
            if (in >= 'a' && in <= 'z') {
                int hmm = ((int) in + num - 97) % 26;
                // System.out.println("hmm=" + hmm);
                if (hmm < 0) {
                    // System.out.println((int) 'z');
                    ans += (char) ((int) 'z' + hmm + 1);
                } else {
                    ans += (char) (hmm + 97);
                }

            }

            else if (in >= 'A' && in <= 'Z') {
                int hmm = ((int) in + num - 'A') % 26;
                // System.out.println("hmm=" + hmm);
                if (hmm < 0) {
                    // System.out.println((int) 'z');
                    ans += (char) ((int) 'Z' + hmm + 1);
                } else {
                    ans += (char) (hmm + 'A');
                }
            } else {
                ans += in;
            }
        }
        System.out.println(ans);

    }
}