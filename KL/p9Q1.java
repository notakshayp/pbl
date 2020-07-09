abstract class GeneralBank {
    abstract double getSavingInterestRate();

    abstract double getFixedInterestRate();
}

class ICICIBank extends GeneralBank {
    double getFixedInterestRate() {
        return 4;
    }

    double getSavingInterestRate() {
        return 8.5;
    }
}

class KotMBank extends GeneralBank {
    double getFixedInterestRate() {
        return 6;
    }

    double getSavingInterestRate() {
        return 9;
    }
}

public class p9Q1 {
    public static void main(String[] args) {
        ICICIBank f1 = new ICICIBank();
        KotMBank f2 = new KotMBank();
        GeneralBank f3 = new ICICIBank();
        GeneralBank f4 = new KotMBank();

        System.out.println(f1.getFixedInterestRate());
        System.out.println(f1.getSavingInterestRate());

        System.out.println(f2.getFixedInterestRate());
        System.out.println(f2.getSavingInterestRate());

        System.out.println(f3.getFixedInterestRate());
        System.out.println(f3.getSavingInterestRate());

        System.out.println(f4.getFixedInterestRate());
        System.out.println(f4.getSavingInterestRate());

    }
}