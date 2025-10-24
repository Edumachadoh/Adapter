package Classe;

import Interface.IRedeSocial;

public class Linkedln implements IRedeSocial {
    @Override
    public void agendarPublicacao() {
        System.out.println("Agendada a publicacao no Linkedln");
    }

    @Override
    public void fazerPublicacao() {
        System.out.println("Publicação feita em Linkedln");
    }
}
