package Random;

import java.util.Random;

public class Repetition {
    // Adding a seed to keep the test data the same
    Random rand = new Random(10);
    public static void main(String[] args) {
        Repetition myRep = new Repetition();
        // Working with (while)
        for (int i = 0; i < 10; i++) {
            System.out.println(myRep.rand.nextInt(10) + 1);
        }
    }
}
