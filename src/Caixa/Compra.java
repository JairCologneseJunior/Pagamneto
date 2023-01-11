package Caixa;

import Imprecao.Imprimivel;
import Pagamento.Altorizacao;

public class Compra implements Imprimivel, Altorizacao {
    // Além dos dados de compra do produto, devemos implementar
    // os métodos das duas INTERFACES
    private double valorCompra;
    private String nomeDoProduto;
    private String nomeCliente;

    @Override
    public String getCabrcalhoNF() {
        // mostrar o nome do cliente

        return this.getNomeCliente();
    }

    @Override
    public String getCorpoNF() {
        // mostrar o produto e o valor da compra
        return this.nomeDoProduto + "=" + this.valorCompra;
    }

    @Override
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
