package Adaptadores;

import Fabrica.FabricaTwitter;
import Interface.IRedeSocial;

public class AdaptadorTwitter implements IRedeSocial{
    // propriedade privada com o objeto incompativel
    private FabricaTwitter legadoTwitter;
    
    // construtor com dependencia da classe incompativel
    public AdaptadorTwitter(FabricaTwitter twitter) {
        this.legadoTwitter = twitter;
    }

    @Override
    public void agendarPublicacao() {
        this.legadoTwitter.criar().agendarPublicacao();
    }

    @Override
    public void fazerPublicacao() {
        this.legadoTwitter.criar().fazerPublicacao();
    }
}
