public class Pessoa {
    double altura;
    String etnia;
    int idade;

    public Pessoa(double altura, String etnia, int idade) {
        this.altura = altura;
        this.etnia = etnia;
        this.idade = idade;
    }

    public void trabalhar() {
        System.out.println("A pessoa está trabalhando em sua jangada.");
    }
}

