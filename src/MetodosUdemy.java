public class MetodosUdemy {


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;


        }
        return finalScore;
//      return fora do bloco if
    }

    public static boolean isTooYoung(int age) {
        if (age < 21) {

            return true;
        }
        return false;
    }
///     return finaliza o bloco, nesse caso o primeiro return só vai ser considerado se (age < 21), já que ta dentro
///     do bloco, finalizando o chamado do metodo, caso contrario vai retornar false já que não tem mais nenhuma
///     condição a ser atendida

    // // // // // // // // // // // // // // // // // // // // // // // //

//  outra forma de criar o isTooYoung

//   public static boolean isTooYoung(int age) {
//        boolean result = false;
//        if (age < 21)   {
//            result = true;
//        }
//        return result;
//    }

///     nesse caso, criou uma variável boolean com valor padrão false, SE o resultado do bloco for < 21 vai trocar
///     o valor pra true, caso contrário permanece em false, e o return vai ser o resultado da variável

}
