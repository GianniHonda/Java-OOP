package POO;

import POO.heranca.Veiculo;

public class Carro implements POO.interfaces.Veiculo{

    @Override
    public void acelerar(String texto) {
        System.out.println(texto);
    }

    @Override
    public void frear(String texto) {
        System.out.println(texto);
    } 
}
