package Adaptadores;

public class AdaptadorTiktok {
    // propriedade privada com o objeto incompativel
    private GatewayPagamentoLegado gatewayLegado;
    
    // construtor com dependencia da classe incompativel
    public GatewayPagamentoAdapter(GatewayPagamentoLegado gateway) {
        this.gatewayLegado = gateway;
    }

    @Override
    public boolean validarCartao(String numeroCartao) {
        // adicionar metodo incompativel
        return this.gatewayLegado.validarCartaoCredito(numeroCartao);
    }

    @Override
    public void processadorPagamento(double valor) {
        // buscar a moeda em uma propriedade específica
        this.gatewayLegado.EfetuarPagamento(valor, "BRL");
    }
}
