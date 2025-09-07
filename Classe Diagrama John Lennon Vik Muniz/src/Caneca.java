public class Caneca {
    String corCaneca;
    String materialCaneca;
    String textura;

    public Caneca(String corCaneca, String materialCaneca, String textura) {
        this.corCaneca = corCaneca;
        this.materialCaneca = materialCaneca;
        this.textura = textura;
    }

    public void usar() {
        System.out.println("A caneca está sendo usada para beber.");
    }
}
