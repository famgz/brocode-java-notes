import java.util.Random;

public class DiceRoller {

    // GLOBAL
    Random random;
    int number;

    DiceRoller() {
        random = new Random();
        // LOCAL -> need to pass parameters to method
        // Random random = new Random();
        // int number = 0;
        // roll(random, number);
        roll();
    }

    // void roll(Random random, int number) {
    void roll() {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
