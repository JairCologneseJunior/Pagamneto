package Pagamento;

public class Nubamk implements Operadora {
    @Override
    public boolean autorizar(Altorizacao autorizacao, Cartao cartao) {
        return cartao.getNumeroDoCartao().startsWith("123") &&
                autorizacao.getValorCompra()<500;
    }
}
