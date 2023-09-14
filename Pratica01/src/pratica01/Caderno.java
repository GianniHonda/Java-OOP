package pratica01;
public class Caderno {
    String cor;
    String tipo;
    float espessura;
    int numeroDePag;
    int tamanho;
    boolean aberto;
    
    void status() {
        System.out.println("Cor " + this.cor);
        System.out.println("Tipo " + this.tipo);
        System.out.println("Espessura " + this.espessura);
        System.out.println("Numero de paginas " + this.numeroDePag);
        System.out.println("Tamanho " + this.tamanho);
        System.out.println("Esta aberto? " + this.aberto);
    }
    void usar() {
        if (this.aberto == true) {
            System.out.println("Estou usando o caderno!");
        }else {
            System.out.println("ERRO! Caderno nao pode ser usado!");
        }
    }
    void abrir() {
        this.aberto = true;
    }
    void fechar() {
        this.aberto = false;
    }
    
}
