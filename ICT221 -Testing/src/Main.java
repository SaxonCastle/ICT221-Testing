import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);


        int counter = 0;
        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 3; i++) {

            int a = rand.nextInt(10) + 1;
            int b = rand.nextInt(10) + 1;


            int diceRoll = rand.nextInt(3) + 1;
            System.out.printf("This current dice roll is: %d\n", diceRoll);


            if (diceRoll == 1) {
                Question q = new Question(a, b, "+");
                q.showQuestion();

                int response = input.nextInt();
                if (q.checkAnswer(diceRoll, response)) {
                    counter++;
                }


            } else if (diceRoll == 2) {

                if (a < b) {
                    Question q = new Question(b, a, "-");//swapped the b and a ints so that the answer can never be negative
                    q.showQuestion();

                    int response = input.nextInt();
                    if (q.checkAnswer(diceRoll, response)) {
                        counter++;
                    }

                } else {
                    Question q = new Question(a, b, "-");
                    q.showQuestion();

                    int response = input.nextInt();
                    if (q.checkAnswer(diceRoll, response)) {
                        counter++;
                    }
                }

            } else if (diceRoll == 3) {
                Question q = new Question(a, b, "*");
                q.showQuestion();

                int response = input.nextInt();
                if (q.checkAnswer(diceRoll, response)) {
                    counter++;
                }


            } else if (diceRoll == 4) {
                Question q = new Question(a, b, "/");
                q.showQuestion();

                int response = input.nextInt();
                if (q.checkAnswer(diceRoll, response)) {
                    counter++;
                }

            } else {
                System.out.println("You should not be seeing this.");
            }
        }

        long time2 = System.currentTimeMillis();
        double finalTimer = time2 - time1;
        System.out.println("You completed the questions in " + (finalTimer / 1000) + " seconds!");

        System.out.printf("You got %s correct!", counter);

    }
}