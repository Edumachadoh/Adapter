package Adaptadores;


import Fabrica.FabricaLinkedln;
import Interface.IRedeSocial;

public class AdaptadorLinkedln implements IRedeSocial{
    // propriedade privada com o objeto incompativel
    private FabricaLinkedln legadoLinkedln;
    
    // construtor com dependencia da classe incompativel
    public AdaptadorLinkedln(FabricaLinkedln linkedln) {
        this.legadoLinkedln = linkedln;
    }

    @Override
    public void agendarPublicacao() {
        this.legadoLinkedln.criar().agendarPublicacao();
    }

    @Override
    public void fazerPublicacao() {
        this.legadoLinkedln.criar().fazerPublicacao();
    }
}
