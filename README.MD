# Padrões de Projeto - Sistema de Integração de APIs de Mídia Social com Padrão Adapter

## Explicação

### Padrão utilizado: 
Factory Method e Adapter

### Explicação
Nessa abordagem foi utilizado o factory method para que seja criado uma fábrica para cada rede social (Instagram, Twitter, Linkedln e Tiktok) para que não sejam acessadas as classes concretas diretamente. O Adapter vem com a função de conseguir consumir uma rede social e fazer uma publicação ou agendar uma publicação, e para isso foi criado uma classe Adapter para cada rede social, por exemplo AdaptadorTwitter, essa classe Adapter vai conter um atributo privado do tipo da fabrica da respectiva rede social, que no método construtor dessa classe atribui o valor desse atributo privado com a fabrica recebida por parâmetro.
Logo o adaptador consegue "consumir" uma rede social, e essa classe implementa IRedeSocial assim como as classes concretas
