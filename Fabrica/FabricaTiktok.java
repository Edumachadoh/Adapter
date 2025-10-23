package Fabrica;

import Classe.Tiktok;
import Interface.IRedeSocial;

public class FabricaTiktok implements IFabricaRedeSocial{

    @Override
    public IRedeSocial criar() {
        return new Tiktok();
    }
    
}
