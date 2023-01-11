package Pagamento;

public interface Operadora {
    //so preciso saber se vai aotorisar a compra ou nao

    public boolean autorizar (Altorizacao autorizacao, Cartao cartao);
}
