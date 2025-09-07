public class Produto {
    double preco;
    boolean qualidade;
    String origem;

    public Produto(double preco, boolean qualidade, String origem) {
        this.preco = preco;
        this.qualidade = qualidade;
        this.origem = origem;
    }

    public void vender() {
        System.out.println("O produto está sendo vendido no mercado.");
    }
}

