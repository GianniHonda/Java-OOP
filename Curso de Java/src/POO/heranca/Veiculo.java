package POO.heranca;

public class Veiculo {

    //propriedades | atributos | campos | variaveis de instancia
    String cor; //variavel de instancia
    String placa;

    public Veiculo(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public void detalhesVeiculo(String veiculo){
        System.out.println("O(a)  " + veiculo + " tem a cor " + cor + " e o numero da placa e: " + placa);
    }

    //Metodo - Comportamento do objeto, acoes
    public void acelerar(String veiculo){
        System.out.println("O(a) " + veiculo + " esta em movimento.");
    }

    public void frear(String veiculo){
        System.out.println("A velocidade do(a)" + veiculo + " foi reduzida(o).");
    }

    public void abastecer(String veiculo, String combustivel){
        System.out.println("O(a) " + veiculo + " esta sendo abastecido(a) com: " + combustivel);
    }
}
