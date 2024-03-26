# Diagrama de classes do iPhone

## Descrição
Neste repositório, você encontrará uma implementação de um desafio de modelagem de software que tem como objetivo representar de forma detalhada as funcionalidades do iPhone. Este projeto utiliza princípios de programação orientada a objetos e técnicas de modelagem UML. Criando um diagrama de classes e interfaces com a proposta de representar os papéis do iPhone. Para criar uma estrutura que permita que o iPhone desempenhe 3 papéis distintos:
* Reprodutor Musical
* Aparelho Telefônico
* Navegador na Internet.


## Diagrama UML
<p align="center">
    <img src="docs/DiagramaUML.png" alt="Diagrama de Classes">
</p>

### `iPhone`
A classe `Iphone` é a classe principal que representa o dispositivo como um todo, no qual implementará as interfaces permitindo que o iPhone apresente os papéis de reprodutor musical, aparelho telefonico e navegador de internet.

### `ReprodutorMusical`, `AparelhoTelefonico`, `NavegadorInternet`
Estas interfaces tem como objetivo definir os métodos necessários para a reprodução de musica, funcionalidades para realizar chamadas telefonicas e capacidade de navegação à internet.

### `IphoneUsuario`
Essa classe tem como objetivo simular o uso de um usuário com o seu iPhone no dia a dia, utilizando todas as funcionalidades que a classe `Iphone` implementa.