public class Veiculo {

    String cor;
    int qtdRodas;
    boolean motor;

    public Veiculo(String cor, int qtdRodas, boolean motor) {
        this.cor = cor;
        this.qtdRodas = qtdRodas;
        this.motor = motor;
    }

    public void andar() {
        System.out.println("O veículo está em movimento.");
    }

    public void transportar() {
        System.out.println("O veículo está transportando pessoas ou objetos.");
    }

    public void frear() {
        System.out.println("O veículo está freando para parar.");
    }
}
