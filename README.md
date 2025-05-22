Parrot Refactoring Kata Java version
====================================
Esse é um repositório criado de maneira a resolver o
Kata do Parrot Refactoring, um projeto simples que 
resgata valores de ações específicas de um papagaio, 
como velocidade ou o seu grito.

Cada papagaio possui atributos específicos e uma espécie
atribuída.

## Melhorias Realizadas
### Remoção da Longa Lista de Parâmetros (Code Smell)
Na classe Parrot o construtor possuia 4 parâmetros, o que
é classificado como um Code Smell e por isso foi ajustado
para utilizar uma classe de dados chamada ParrotDetails para
guardar atributos do papagaio (excluindo a espécie), 
assim reduzindo seu tamanho para 2 parâmetros.

### Remoção da 'Super Classe' (Code Smell)
A classe Parrot era responsável por praticamente todo a
lógica e armazenamento de valores do projeto. Por conta 
disso, foi criado diversos componentes para reduzir o
acoplamento.

Os componentes criados são os seguintes:
- ParrotDetails: Responsável por armazenar valores de 
atributos básicos de cada papagaio.
- ParrotActions: Componente responsável pela lógica das 
ações do papagaio, seguindo um padrão de Strategy, os 
strategies criados foram: AfricanParrotActions, 
EuropeanParrotActions e NorwegianBlueParrotActions.
- ParrotActionsFactory: Responsável por criar um
ParrotActions baseado no enum de ParrotTypeEnum.
