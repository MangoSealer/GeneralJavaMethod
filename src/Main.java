@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {

        double kilometers = (100 * 1.609344);
        /// conversion ratio from miles to KMs

        int highScore = 50;
        System.out.println(highScore);
        if (highScore > 25) {
            highScore = highScore + 1000;
            System.out.println(highScore);
        }

        int health = 100;

        if ((health < 25) &&  (highScore > 1000)){
            highScore = highScore - 1000;
            System.out.println("Checkpoint da variavel = " + highScore);
        }






    }
}
