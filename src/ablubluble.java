public class ablubluble {
    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("The HighScore is " + highScore);


        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println("The next highScore is " + calculateScore(gameOver, score, levelCompleted, bonus));


    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += (1000);


        }

        return finalScore;


    }


}
