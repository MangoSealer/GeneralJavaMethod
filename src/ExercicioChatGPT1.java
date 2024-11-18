public class ExercicioChatGPT1 {

    public static void ExercicioGPT(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            score += ((levelCompleted * bonus) + 1000);
            System.out.println("Seu Score foi = " + score);
            if (score > 5000) {
                System.out.println("Parabéns! Você fez uma pontuação excelente!");
                return;
            }
            if ((levelCompleted <= 3) && (score < 5000)) {
                System.out.println("Precisa melhorar!");
                return;

            }
            if (score < 5000) {
                System.out.println("Continue tentando!");
            }


        }
    }
}
