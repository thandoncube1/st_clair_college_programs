package Random;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.print("Random: " + rand.nextInt());
        System.out.println(rand.nextInt(10) + 1);
    }
}
