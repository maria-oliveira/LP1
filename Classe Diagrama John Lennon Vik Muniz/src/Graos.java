public class Graos {
    boolean qualidade;
    String origem;
    String corGrao;

    public Graos(boolean qualidade, String origem, String corGrao) {
        this.qualidade = qualidade;
        this.origem = origem;
        this.corGrao = corGrao;
    }

    public void moer() {
        System.out.println("Os grãos estão sendo moídos para fazer café.");
    }
}
