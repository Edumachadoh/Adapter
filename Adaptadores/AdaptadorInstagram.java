package Adaptadores;

import Fabrica.FabricaInstagram;
import Interface.IRedeSocial;

public class AdaptadorInstagram implements IRedeSocial{
    // propriedade privada com o objeto incompativel
    private FabricaInstagram legadoInstagram;
    
    // construtor com dependencia da classe incompativel
    public AdaptadorInstagram(FabricaInstagram instagram) {
        this.legadoInstagram = instagram;
    }

    @Override
    public void agendarPublicacao() {
        this.legadoInstagram.criar().agendarPublicacao();
    }

    @Override
    public void fazerPublicacao() {
        this.legadoInstagram.criar().fazerPublicacao();
    }
}
