public class MetodoCarro {


    //atributos
    String nome;
    String marca;
    int ano;
    int vel;

    //métodos
    void acelerar(int aceleracao) {
        vel += aceleracao;
        System.out.println("Velocidade atual = " + vel + " km/h");
    }

    void freiar(int reduzir) {
        vel -= reduzir;
        System.out.println("Velocidade atual = " + vel + " km/h");
    }

    void buzinar() {
        System.out.println("bibibi");
    }


}




