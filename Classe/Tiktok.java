package Classe;

import Interface.IRedeSocial;

public class Tiktok implements IRedeSocial{

    @Override
    public void agendarPublicacao() {
        System.out.println("Agendada a publicacao no TikTok");
    }

    @Override
    public void fazerPublicacao() {
        System.out.println("Publicação feita em Tiktok");
    }
    
}
