package Fabrica;

import Classe.Instagram;
import Interface.IRedeSocial;

public class FabricaInstagram implements IFabricaRedeSocial{
    @Override
    public IRedeSocial criar() {
        return new Instagram();
    }
    
}
