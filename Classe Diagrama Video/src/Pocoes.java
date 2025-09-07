public class Pocoes {
    String nome;
    String cor;
    boolean raridade;

    public Pocoes(String nome, String cor, boolean raridade) {
        this.nome = nome;
        this.cor = cor;
        this.raridade = raridade;
    }

    public void envenenar() {
        System.out.println("A poção tem um efeito venenoso.");
    }

    public void matar() {
        System.out.println("A poção pode ser usada para matar.");
    }

    public void apaixonar() {
        System.out.println("A poção cria uma paixão na vítima.");
    }
}
