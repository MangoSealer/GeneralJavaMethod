public class ProdutoTestar {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "bic";
        p1.valor = 1.50;


        Produto p2 = new Produto("Caneta vermelha", "Faber");
        p2.valor = 1.69;

        Produto p3 = new Produto("Borracha", "Mercur", 1.89);



    }
}
