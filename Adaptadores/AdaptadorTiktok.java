package Adaptadores;

import Fabrica.FabricaTiktok;
import Interface.IRedeSocial;

public class AdaptadorTiktok implements IRedeSocial{
    // propriedade privada com o objeto incompativel
    private FabricaTiktok legadoTiktok;
    
    // construtor com dependencia da classe incompativel
    public AdaptadorTiktok(FabricaTiktok tiktok) {
        this.legadoTiktok = tiktok;
    }

    @Override
    public void agendarPublicacao() {
        this.legadoTiktok.criar().agendarPublicacao();
    }

    @Override
    public void fazerPublicacao() {
        this.legadoTiktok.criar().fazerPublicacao();
    }
}
