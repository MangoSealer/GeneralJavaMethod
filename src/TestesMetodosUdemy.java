public class TestesMetodosUdemy {
    public static void main(String[] args) {

        int highScore = MetodosUdemy.calculateScore(true, 800, 5, 100);

        System.out.println("The highScore is " + highScore);


        // // // // //

        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        System.out.println("The next highScore is " +
                MetodosUdemy.calculateScore(true, score, levelCompleted, bonus));

        boolean idade = MetodosUdemy.isTooYoung(25);
        if (idade) {
            System.out.println("dimenó");
        } else {
            System.out.println("dimaió");
        }
///     variável boolean pra usar o bloco if, parâmetro setado pra (< 21) ou (> 21) com valor int
///     considerando o funcionamento do bloco isTooYoung, if (boolean setado) = true vai printar dimenó
///     else, dimaió
//      exercicio, criar metodo que faça o contrário do que o isTooYoung faça, isOldEnough

    }
}
