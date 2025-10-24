package Fabrica;

import Classe.Linkedln;
import Interface.IRedeSocial;

public class FabricaLinkedln implements IFabricaRedeSocial{
    @Override
    public IRedeSocial criar() {
        return new Linkedln();
    }
    
}
