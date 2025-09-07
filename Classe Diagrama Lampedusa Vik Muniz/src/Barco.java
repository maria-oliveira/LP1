public class Barco {
    String material;
    String velaCor;
    double mastroAltura;

    public Barco(String material, String velaCor, double mastroAltura) {
        this.material = material;
        this.velaCor = velaCor;
        this.mastroAltura = mastroAltura;
    }

    public void navegar() {
        System.out.println("O barco está navegando no mar.");
    }
}