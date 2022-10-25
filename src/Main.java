import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int die1 = rnd.nextInt(1, 7);
        int die2 = rnd.nextInt(1, 7);
        int firstRoll = die1 + die2;
        int newRoll = 0;
        System.out.printf("%d + %d = %d %n", die1, die2, firstRoll);

        if (firstRoll == 7 || firstRoll == 11) {
            System.out.println("You Win!");
            return;
        }
        if (firstRoll == 2 || firstRoll == 3 || firstRoll == 12) {
            System.out.println("You Lose!");
            return;
        }
        while (newRoll != firstRoll && newRoll != 7) {
            die1 = rnd.nextInt(1, 7);
            die2 = rnd.nextInt(1, 7);
            newRoll = die1 + die2;
            System.out.printf("%d + %d = %d %n", die1, die2, newRoll);
        }
        if (newRoll == firstRoll) {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("You Lose!");
        }
    }
}