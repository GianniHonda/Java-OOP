package pratica02;
public class Pratica02 {
    public static void main(String[] args) {
        Danca d1 = new Danca();
        d1.ambiente = "Salao";
        d1.numDePessoas = 2;
        d1.vestimenta = "Trajes Formais";
        d1.ritmo = "Salsa";
        d1.tocarMusica = true;
        d1.apresentacao();
        d1.ligarMusica();
        d1.dancar();
    }
    
}
