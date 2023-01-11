package Caixa;

import Imprecao.Impressora;
import Pagamento.Cartao;
import Pagamento.Operadora;

public class Checkout {
    //finalizar compra ela ser autorizada
    // pelo cartao ela cai ter de fechar a compra que vai receber uma compra de cartao
    private Operadora operadora;
    private Impressora impressora;

    public Operadora getOperadora() {
        return operadora;
    }

    public void setOperadora(Operadora operadora) {
        this.operadora = operadora;
    }

    public Impressora getImpressora() {
        return impressora;
    }

    public void setImpressora(Impressora impressora) {
        this.impressora = impressora;
    }

    public Checkout(Operadora operadora, Impressora impressora) {
        this.operadora = operadora;
        this.impressora = impressora;
    }
    //para fechar a compra e prcisos receber cartao e a compra
    //alem de verificar

    public void fecharCompra(Compra compra, Cartao cartao){


        boolean autorizacao = this.operadora.autorizar(compra,cartao);
        if (autorizacao){
            this.impressora.imprimir(compra);
        }else {
            System.out.println("Compra nao autorizada" );
        }
    }
}
