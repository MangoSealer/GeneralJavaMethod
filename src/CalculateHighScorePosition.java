public class CalculateHighScorePosition {


    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list");
    }

    public static int calculateHighScorePosition(int score) {

        int userResult = 0;


        if (score >= 1000) {
            userResult = 1;
            return userResult;

        } else if (score >= 500) {
            userResult = 2;
            return userResult;


        } else if (score >= 100) {
            userResult = 3;
            return userResult;


        } else {
            userResult = 4;
            return userResult;

        }
//      tinha a opção de tirar o ultimo bloco else e aqui só colocar um return 4; pro final do metodo, considerando
//      que nenhuma condição foi atendida e que não tinha um else pra pegar o que falta, o return do metodo jogaria 4
    }


    /// uma possibilidade do bloco condicional

//    int position = 4;
//    if(score >=1000){
//        position = 1;
//    } else if(score >=500){
//        position = 2;
//    } else if(score >=100){
//    position = 3;
//  }
//    return position;

///     adicionar comentarios explicando


}
