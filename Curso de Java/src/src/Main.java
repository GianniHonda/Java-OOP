import java.util.Arrays;
import java.util.Scanner;

import POO.Carro;

public class Main {
    public static void main(String[] args) {
        //tipo de dado + identificacao + valor atribuido
       /*byte idade = 120;
       short estoque = 32000;
       int numero = 2147483647;
       long contaCorrente = 9223372036854775807L; 
       float real = 10.50f;
       double dolar =50.864560394857327;
       String nome = "Gianni Stephanie";
       char minhaLetra = 'A';
       boolean botaoAtivado = true;
       boolean botaoDesativado = false;

       var sobrenome = "Carreira Honda";

       //Classes Wrappers
       Integer numeros = 2343454;
       Character meusNumeros = '2';*/

       //Multabilidade e imultabilidade
       /*Mutaveis 
       byte idade = 30;

       idade = 50;

       idade = 120;*/

       /*Imutaveis ou constantes 
       final String NOME = "Carlos";
       */

       /*Concatenacao */
       /*String nome;
       Byte idade;
       String profissao;

       System.out.println("Qual e o seu nome?"); 
       Scanner entradaUsuario = new Scanner(System.in);
       nome = entradaUsuario.nextLine();
       System.out.println("Qual e a sua profissao?");
       profissao = entradaUsuario.nextLine();
       System.out.println("Qual e a sua idade?");
       idade = entradaUsuario.nextByte();*/

       /*
        if(condicao){
        Codigo que vai ser executado quando for verdadeiro
        }else { false
        Codigo que vai ser executado quando for falso
        }
        */

       /*byte idade;

       System.out.println("Qual e a sua idade?");
       Scanner entradaUsuario = new Scanner(System.in);
       idade = entradaUsuario.nextByte();

       if (idade <= 10) {
        System.out.println("Crianca");
       }else if (idade <= 17) {
        System.out.println("Adolescente");
       }else {
        System.out.println("Adulto");
       }*/

       //Operadores logicos (|| e &&)

        /*int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        System.out.println("Digite o primeiro numero:");
        Scanner entradaUsuario = new Scanner(System.in);

        if (numero1 == numero2 && numero3 < numero4) {
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }*/

        //Arrays (Varios valores dentro de uma unica variavel)
        /*String[] listaCompras = {"Banana","Carne","Ovos","Feijao","Arroz","Abacate","Batata"};
        int[] sorteio = {10, 20, 30, 40, 50};
        double[] valores = {10.50, 100.900, 99.98};
        boolean[] estatus = {false,true,false}; 

        Scanner entradaUsuario = new Scanner(System.in);

        System.out.println(Arrays.toString(listaCompras));*/
       
        //While (enquanto)
        /*int indice = 0;
        String[] listaCompras = {"Banana","Carne","Ovos","Feijao","Arroz","Abacate","Batata"};

        Scanner entradaUsuario = new Scanner(System.in);

        while (listaCompras.length <= 7) {
            System.out.println(listaCompras[indice]);
            indice++;
        }*/

        //For (mais enxuto que o while)
        /*String[] listaCompras = {"Banana","Carne","Ovos","Feijao","Arroz","Abacate","Batata"};

        Scanner entradaUsuario = new Scanner(System.in);

        for (int indice = 0; listaCompras.length <= 7; indice++){
            System.out.println(listaCompras[indice]);
        }*/

        //Switch
        /*byte opcoesBanco;
        
        System.out.println("Escolha uma opcao: \n " +
        "1 - Ver fatura do cartao \n " +
        "2 - Saldo conta corrente \n " +
        "3 - Poupanca \n " +
        "4 - Cambio");

        Scanner entradaUsuario = new Scanner(System.in);
        opcoesBanco = entradaUsuario.nextByte();

        switch (opcoesBanco){
            case 1:
            System.out.println("Ver fatura do cartao");
            break;

            case 2:
            System.out.println("Saldo conta corrente");
            break;

            case 3:
            System.out.println("Poupanca");
            break;

            case 4:
            System.out.println("Cambio");
            break;

            default:
            System.out.println("Nenhuma opcao selecionada");*/

        Carro carro1 = new Carro("Azul", "BRA789");
        carro1.detalhesCarro();
        carro1.acelerar();

        Carro carro2 = new Carro("Rosa", "RIO078950");
        carro2.detalhesCarro();
        carro2.paisDeOrigem("Brasil");
        carro2.abastecer();

        System.out.println(carro1);
    }
}
