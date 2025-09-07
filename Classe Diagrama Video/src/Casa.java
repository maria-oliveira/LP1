public class Casa {
    boolean decoracao;
    int qtdParedes;
    String cor;

    public Casa(boolean decoracao, int qtdParedes, String cor) {
        this.decoracao = decoracao;
        this.qtdParedes = qtdParedes;
        this.cor = cor;
    }

    public void abrigar() {
        System.out.println("A casa abriga a bruxa e seus segredos.");
    }

    public void receberVisita() {
        System.out.println("A casa está pronta para receber visitas.");
    }

    public void guardar() {
        System.out.println("A casa guarda itens e objetos mágicos.");
    }
}
