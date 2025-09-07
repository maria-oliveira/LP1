public class Bebida {
    String temperaturaBebida;
    double preco;
    String corBebida;

    public Bebida(String temperaturaBebida, double preco, String corBebida) {
        this.temperaturaBebida = temperaturaBebida;
        this.preco = preco;
        this.corBebida = corBebida;
    }

    public void beber() {
        System.out.println("A bebida está sendo consumida.");
    }
}
