public class Pessoa {

    double altura;
    String nome;
    String corCabelos;

    public Pessoa(double altura, String nome, String corCabelos) {
        this.altura = altura;
        this.nome = nome;
        this.corCabelos = corCabelos;
    }

    public void beber() {
        System.out.println("A pessoa está bebendo um chá.");
    }

    public void respirar() {
        System.out.println("A pessoa está respirando.");
    }

    public void amar() {
        System.out.println("A pessoa está amando alguém.");
    }
}
