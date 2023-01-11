package Pagamento;

public class Cartao {
    // Aqui, essa classe trata das informações básicas do cartão do cliente,
    // que devem ser repassadas para as interfaces
    // A interface Operadora é quem vai dizer se a compra desse cartão
    // é válida ou não
    private String nomeDOCliente;

    public String getNomeDOCliente() {
        return nomeDOCliente;
    }

    public void setNomeDOCliente(String nomeDOCliente) {
        this.nomeDOCliente = nomeDOCliente;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    private String numeroDoCartao;

}
