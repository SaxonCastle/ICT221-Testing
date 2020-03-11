public class Question {

    private int value1;
    private int value2;
    private String operator;



    public Question(int v1, int v2, String op) {
        value1 = v1;
        value2 = v2;
        operator = op;
    }

    public void showQuestion() {
        System.out.printf("What is %d %s %d?\n", value1, operator, value2);
    }


    public boolean checkAnswer(int diceRoll, int response) {
        switch (diceRoll) {
            case 1:
                if ((value1 + value2) == response) {
                    System.out.println("correct!");
                    return true;
                } else {
                    System.out.println("Incorrect!");
                    return false;
                }


            case 2:
                if ((value1 - value2) == response) {
                    System.out.println("correct!");
                    return true;
                } else {
                    System.out.println("Incorrect!");
                    return false;
                }


            case 3:
                if ((value1 * value2) == response) {
                    System.out.println("correct!");
                    return true;
                } else {
                    System.out.println("Incorrect!");
                    return false;
                }


            case 4:
                if ((value1 / value2) == response) {
                    System.out.println("correct!");
                    return true;
                } else {
                    System.out.println("Incorrect!");
                    return false;
                }
        } return false;
    }
}


