import java.util.Scanner;

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

        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 30;
        int numero4 = 40;

        System.out.println("Digite o primeiro numero:");
        Scanner entradaUsuario = new Scanner(System.in);

        if (numero1 == numero2 && numero3 < numero4) {
            System.out.println("Verdadeiro");
        }else {
            System.out.println("Falso");
        }

       
    }
}
