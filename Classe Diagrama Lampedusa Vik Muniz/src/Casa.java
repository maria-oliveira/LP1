public class Casa {
    String corCasa;
    int qtdParedes;
    String local;

    public Casa(String corCasa, int qtdParedes, String local) {
        this.corCasa = corCasa;
        this.qtdParedes = qtdParedes;
        this.local = local;
    }

    public void abrigar() {
        System.out.println("A casa abriga pessoas que precisam de refúgio.");
    }
}
