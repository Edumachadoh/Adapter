import Adaptadores.AdaptadorInstagram;
import Adaptadores.AdaptadorTiktok;
import Adaptadores.AdaptadorTwitter;
import Fabrica.FabricaInstagram;
import Fabrica.FabricaTiktok;
import Fabrica.FabricaTwitter;
import Interface.IRedeSocial;

public class Main {
    public static void main(String[] args) {

        // criar a rede social tiktok e iniciar as postagens ou agendamentos
        IRedeSocial redeSocial1 = new AdaptadorTiktok(new FabricaTiktok());
        redeSocial1.agendarPublicacao();
        
        // criar a rede social instagram e iniciar as postagens ou agendamentos
        IRedeSocial redeSocial2 = new AdaptadorInstagram(new FabricaInstagram());
        redeSocial2.agendarPublicacao();
        redeSocial2.fazerPublicacao();

        IRedeSocial redeSocial3 = new AdaptadorTwitter(new FabricaTwitter());
        redeSocial3.agendarPublicacao();
        redeSocial3.agendarPublicacao();
        redeSocial3.agendarPublicacao();
        redeSocial3.agendarPublicacao();
        redeSocial3.agendarPublicacao();
        


    }

}
