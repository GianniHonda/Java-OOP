package POO;

public class Carro {
    //propriedades | atributos | campos | variaveis de instancia
    String cor;
    String placa;

    public Carro(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesCarro(){
        System.out.println("O carro tem a cor " + cor + " e o numero da placa e: " + placa);
    }

    //Metodo - Comportamento do objeto, acoes
    public void acelerar(){
        System.out.println("Carro esta em movimento...");
    }

    public void frear(){
        System.out.println("A velocidade do carro foi reduzida.");
    }

    public void abastecer(){
        System.out.println("O carro esta sendo abastecido com gasolina.");
    }

    /*public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }*/

    
}
