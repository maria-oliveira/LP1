public class Jangada {
    double mastro_altura;
    String vela_cor;
    String material;

    public Jangada(double mastro_altura, String vela_cor, String material) {
        this.mastro_altura = mastro_altura;
        this.vela_cor = vela_cor;
        this.material = material;
    }

    public void navegar() {
        System.out.println("A jangada está navegando em direção ao mar.");
    }
}