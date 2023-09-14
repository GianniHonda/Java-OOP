package pratica01;
public class Pratica01 {
    public static void main(String[] args) {
       Caderno c1 = new Caderno();
       c1.cor = "Amarelo";
       c1.espessura = 3.5f;
       c1.numeroDePag = 100;
       c1.tamanho = 25;
       c1.tipo = "De dezenho";
       c1.aberto = true;
       c1.status();
       c1.abrir();
       c1.usar();
       
    }
    
}
