public class Animais {
    String raca;
    int idade;
    String cor;

    public Animais(String raca, int idade, String cor) {
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
    }

    public void correr() {
        System.out.println("O animal está correndo livremente.");
    }

    public void comer() {
        System.out.println("O animal está comendo sua comida.");
    }

    public void beber() {
        System.out.println("O animal está bebendo água.");
    }
}
