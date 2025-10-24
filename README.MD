# Padrões de Projeto - Sistema de Integração de APIs de Mídia Social com Padrão Adapter

## Explicação

### Padrão utilizado: 
Factory Method e Adapter

### Explicação
Nesta abordagem, foi utilizado o padrão Factory Method para criar uma fábrica específica para cada rede social (Instagram, Twitter, LinkedIn e TikTok), evitando assim o acesso direto às classes concretas.

O padrão Adapter foi aplicado para permitir que o sistema consuma as funcionalidades de diferentes redes sociais, possibilitando realizar publicações ou agendar postagens de forma uniforme.
Para isso, foi criada uma classe adaptadora para cada rede social, como por exemplo a classe AdaptadorTwitter.

Cada classe adaptadora possui um atributo privado do tipo da fábrica correspondente à rede social, o qual é inicializado no construtor com a fábrica recebida por parâmetro. Dessa forma, o adaptador consegue interagir (“consumir”) com a respectiva rede social sem depender diretamente de sua implementação concreta.

As classes adaptadoras também implementam a interface IRedeSocial, garantindo que todas sigam o mesmo contrato de funcionalidades.

Na classe principal (main), o usuário instancia uma rede social associando-a a um adaptador, que recebe como parâmetro a fábrica específica da rede social desejada. A partir desse objeto, torna-se possível realizar e agendar publicações de maneira unificada, sem precisar conhecer os detalhes de implementação de cada rede social.
