public class Produto {

    //atributos
    String nome;
    String marca;
    double valor;

    //construtores
    Produto() {

    }

    Produto(String nome) {
        this.nome = nome;

    }

    Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;

    }

    Produto(String nome, String marca, double valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;

    }

}
