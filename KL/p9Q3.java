abstract class Instrument {
    abstract void play();
}

class Piano extends Instrument {
    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {
    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {
    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class p9Q3 {
    public static void main(String[] args) {
        Instrument[] idk = new Instrument[10];
        for (int i = 0; i < 10; i++) {

            int roll = (int) (Math.random() * (double) 3);
            if (roll == 1) {
                idk[i] = new Piano();
            } else if (roll == 2) {
                idk[i] = new Flute();
            } else {
                idk[i] = new Guitar();
            }

            System.out.println("Current obj is Piano: " + (idk[i] instanceof Piano));
            System.out.println("Current obj is Flute: " + (idk[i] instanceof Flute));
            System.out.println("Current obj is Guitar: " + (idk[i] instanceof Guitar));
            idk[i].play();
            System.out.println("\n\n");
        }
    }
}