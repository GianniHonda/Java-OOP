package pratica02;
public class Danca {
    String ritmo;
    String vestimenta;
    int numDePessoas;
    String ambiente;
    boolean tocarMusica;
    
    void apresentacao() {
        System.out.println("Ritmo " + this.ritmo);
        System.out.println("Vestimenta " + this.vestimenta);
        System.out.println("Numero de pessoas " + this.numDePessoas);
        System.out.println("Ambiente " + this.ambiente);
        System.out.println("Tocar Musica " + this.tocarMusica);
    }
    void dancar() {
        if (this.tocarMusica == true) {
            System.out.println("A danca comecou!");
        }else {
            System.out.println("A danca nao pode comecar sem musica!");
        }
    }
    void ligarMusica() {
        this.tocarMusica = true;
    }
    void desligarMusica() {
        this.tocarMusica = false;
    }
}
