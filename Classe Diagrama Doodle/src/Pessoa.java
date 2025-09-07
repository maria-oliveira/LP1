public class Pessoa {
    double altura;
    String nome;
    String corOlhos;

    public Pessoa(double altura, String nome, String corOlhos) {
        this.altura = altura;
        this.nome = nome;
        this.corOlhos = corOlhos;
    }

    public void andar() {
        System.out.println("A pessoa está andando pelo parque.");
    }

    public void respirar() {
        System.out.println("A pessoa está respirando o ar puro do parque.");
    }

    public void correr() {
        System.out.println("A pessoa está correndo na pista de corrida.");
    }
}
