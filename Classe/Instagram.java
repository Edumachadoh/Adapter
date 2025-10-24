package Classe;

import Interface.IRedeSocial;

public class Instagram implements IRedeSocial{
    @Override
    public void agendarPublicacao() {
        System.out.println("Agendada a publicacao no Instagram");
    }

    @Override
    public void fazerPublicacao() {
        System.out.println("Publicação feita em Instagram");
    }
}
