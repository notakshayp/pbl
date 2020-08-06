abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    void notice() {
        System.out.println("First Class Compartment");
    }
}

class Ladies extends Compartment {
    void notice() {
        System.out.println("Ladies Compartment");
    }
}

class General extends Compartment {
    void notice() {
        System.out.println("General Compartment");
    }
}

class Luggage extends Compartment {
    void notice() {
        System.out.println("Luggage Compartment");
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] train = new Compartment[10];
        for (int i = 0; i < 10; i++) {

            int roll = (int) (Math.random() * (double) 4);
            if (roll == 1) {
                train[i] = new FirstClass();
            } else if (roll == 2) {
                train[i] = new Ladies();
            } else if (roll == 3) {
                train[i] = new General();
            } else {
                train[i] = new Luggage();
            }

            train[i].notice();
        }
    }
}