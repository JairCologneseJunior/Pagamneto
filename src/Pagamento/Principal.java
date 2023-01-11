package Pagamento;

import Caixa.Checkout;
import Caixa.Compra;
import Imprecao.HP;
import Imprecao.Impressora;

public class Principal {
    public static void main(String[] args) {
    //para testar precisamos instanciar uma operadora um impressoar um cartao
        // uma compra e finalmente instanciar um checkout
        Operadora operadora = new Nubamk();
        Impressora impressora = new HP();
        Cartao cartao = new Cartao();

        cartao.setNomeDOCliente("Jair");
        cartao.setNumeroDoCartao("1234.1212.1212.2121");

        Compra compra =new Compra();
        compra.setNomeCliente("Jair");
        compra.setNomeDoProduto("miniatura do messi careca");
        compra.setValorCompra(200);
        //finalizando a compra
        Checkout checkout = new Checkout(operadora,impressora);
        checkout.fecharCompra(compra,cartao);

    }
}
