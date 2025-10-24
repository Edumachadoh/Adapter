package Fabrica;

import Classe.Twitter;
import Interface.IRedeSocial;

public class FabricaTwitter implements IFabricaRedeSocial{
    @Override
    public IRedeSocial criar() {
        return new Twitter();
    }
}
