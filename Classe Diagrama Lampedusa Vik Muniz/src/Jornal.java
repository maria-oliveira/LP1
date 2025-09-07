public class Jornal {
        String fonteLetra;
        String tipoPapel;
        String corLetra;

        public Jornal(String fonteLetra, String tipoPapel, String corLetra) {
            this.fonteLetra = fonteLetra;
            this.tipoPapel = tipoPapel;
            this.corLetra = corLetra;
        }

        public void informar() {
            System.out.println("O jornal informa sobre os acontecimentos.");
        }
}
