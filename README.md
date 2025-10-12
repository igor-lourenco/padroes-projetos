## Padrões de projetos

##  

### Criacionais

#### Factory Method:

O Factory Method define uma interface para criar um objeto, mas permite que as classes que implementam a interface
decidam qual classe instanciar.</br>
O Factory Method permite uma classe delegar a instanciação a subclasse.

![Factory Method.png](uml%2FFactory%20Method.png)

#### Builder

O Builder permite a criação passo-a-passo de objetos complexos usando uma sequência de ações.</br>
A construção é controlada por um objeto diretor que apenas precisa conter o tipo do objeto que deve ser criado.

![Builder.png](uml%2FBuilder.png)

#### Abstract Factory

O Abstract Factory fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas
classes concretas.

![Abstract Factory.png](uml%2FAbstract%20Factory.png)

##

### Comportamentais

#### Observer

O Observer define uma dependência um-para-muitos entre objetos, então quando o estado de um objeto muda, todos os seus
dependentes serão notificados e atualizados automaticamente.

![Observer.png](uml%2FObserver.png)

#### Strategy

O Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis</br>.
O Strategy deixa o algoritmo variar independente dos clientes que o utilizam.

![Strategy.png](uml%2FStrategy.png)

##

### Estruturais

#### Proxy

O Proxy fornece um substituto ou representante de outro objeto para controlar o acesso a ele.

![Proxy.png](uml%2FProxy.png)

#### Decorator

O Decorator anexa responsabilidades adicionais a um objeto dinamicamente.</br>
Os decoradores fornecem uma alternativa flexível de subclass para estender a funcionalidade.

![Decorator.png](uml%2FDecorator.png)
