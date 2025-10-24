package Classe;

import Interface.IRedeSocial;

public class Twitter implements IRedeSocial {
    @Override
    public void agendarPublicacao() {
        System.out.println("Agendada a publicacao no Twitter");
    }

    @Override
    public void fazerPublicacao() {
        System.out.println("Publicação feita em Twitter");
    }
}