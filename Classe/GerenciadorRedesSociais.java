package Classe;

import Fabrica.IFabricaRedeSocial;
import Interface.IRedeSocial;

public class GerenciadorRedesSociais {
    public void gerenciar(IFabricaRedeSocial fabrica) {
        IRedeSocial redeSocial = fabrica.criar();
        redeSocial.agendarPublicacao();
        redeSocial.fazerPublicacao();

    }
}
