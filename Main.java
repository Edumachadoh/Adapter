import Classe.GerenciadorRedesSociais;
import Fabrica.FabricaTiktok;
import Fabrica.IFabricaRedeSocial;
import Interface.IRedeSocial;

public class Main {
    public static void main(String[] args) {
        //ProcessadorPagamento processador = new GatewayPagamentoAdapter(new GatewayPagamentoLegado());

        GerenciadorRedesSociais gerenciador = new GerenciadorRedesSociais();
        gerenciador.gerenciar(new FabricaTiktok());
        

    }

}
