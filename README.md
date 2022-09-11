# O que são padrões?
> Cada padrão descreve um problema que ocorre frequentemente em seu ambiente, e então descreve o cerne da solução para aquele problema, de um modo tal que você pode usar esta solução milhões de vezes, sem nunca fazer a mesma coisa repetida.
# Padrões de Projetos Criacionais
> Existem diversos mecanismos para criar um objeto. Ao invés de utilizar diretamente o operador "new". Podemos utilizar  algum padrão que nos forneça mais flexibilidade no código.

## Factory Method

> Um padrão que define uma interface para criar um objeto. mas permite as classes decidirem qual classes instanciar. O factory Method permite a uma classe deferir a instanciação para subclasses.

> Nesse padrão temos 3 formas para trabalhar sendo o Factory, HalfSimple e Simple.

### Exemplo utilizado

> Em todos os exemplos apresentados para factory method serão utilizados a Classe abstrata Iphone e as classes
> concretas Iphone11, Iphone11Pro, IphoneX, IphoneXSMax.

* Classes

![](images/classes.png)

* Classe abstrata: Iphone

![](images/iphone.png)

* Exemplo das classes concretas: iphone11

![](images/iphone11.png)

### Sem aplicar padrões

> Sem utilizar os padrões temos a classe genérica [IPHONE](https://github.com/Matheus-Reinert/design-patterns/blob/master/src/main/java/br/com/designPatterns/factory/apple/before/model/IPhone.java) 
> que possui apenas o método getHardware() abstrato pois para cada tipo de iphone será utilizado um hardware diferente.
>
> Teremos tanto uma classe abstrata que representa o objeto de forma genérica como teremos as classes concretas que estendem iphone
> e possuem um único método abstrato para definir os seus respectivos hardwarers.
> 
> No cliente será necessário importar todas as classes e instância-la de acordo com o iphone que deverá ser criado.

![](images/cliente.png)

### Factory

> Diferente do exemplo anterior nesse modelo teremos 4 factorys concretas e uma factory abstrata
> Na iphoneFactory teremos um método para criar um novo iphone e nosso factoryMethod responsável por instanciar um novo iphone.

![](images/iphoneFactory.png)
 
> Basicamente, cada tipo de iphone possuirá uma factory.

![](images/factorys.png)

> No cliente de acordo com o objeto iphone que deve ser criado, deverá instanciar sua factory expecífica,
> Ao invés de ter uma relação direta com cada classe concreta de tipo iphone, se te uma relação direta com cada
> factory específica.

![](images/clienteFactory.png)

### HalfSimple

> No halfSimple será utilizado um parâmetro para dizer qual modelo específico da factory que deve ser criado.
> diminuindo a quantidade de factorys por modelo. Nesse padrão ao invés de  termos uma factory para cada objeto Iphone11, Iphone11Pro, IphoneX e IphoneXSMax. 
> Teremos um factory para iphones 11 e uma para iphones X.

* Iphone factory com parâmetro 

![](images/iphoneFactoryComParametro.png)

* Iphone X factory

![](images/iphoneXFactory.png)

* Iphone 11 factory

![](images/iphone11Factory.png)

> No cliente de acordo com o parâmetro passado será criado o objeto.

![](images/clienteHalfFactory.png)

### Simple

> No Simple temos agora uma classe concreta IphoneSimpleFactory que receberá a geração e o modelo
> do iphone para que o objeto seja criado.

* IphoneSimpleFactory

![](images/IphoneSimpleFactory.png)

> Dessa forma no Cliente é necessário apenas conhecer a classe mais genérica de iphone e a factory

* Cliente

![](images/clienteSimpleFactory.png)


## Abstract Factory

> É utilizada em uma família de objetos, onde existem interfaces diferentes mas que estão relacionadas dentro de uma 
> funcionalidade do sistema.
>
> No exemplo utilizado teremos a criação de um iphone, seus certificados e empacotamento por país.
> Dessa forma, levamos em consideração que certificados e empacotamento são uma família que estarão relacionados.
>


* Estrutura da Abstract Factory

![](images/estruturaDaAbstractFactory.png)

* Exemplo de classe abstrata Iphone 

![](images/classeAbstrataIphoneAbstractFactory.png)

* Exemplo de classe concreta Iphone

![](images/classeConcretaIphoneAbstractFactory.png)

* Exemplo de interface Empacotamento 

![](images/interfaceEmpacotamentoAbstractFactory.png)

* Exemplo de classe concreta Empacotamento

![](images/classeConcretaEmpacotamentoAbstractFactory.png)

* Exemplo de interface Certificado 

![](images/interfaceCertificadosAbstractFactory.png)

* Exemplo de classe concreta Certificado

![](images/classeConcretaCertificadosAbstractFactory.png)

> Utilizaremos ainda um pouco do que foi aprendido anteriormente introduzindo as Factorys por iphone no modelo Simple Factory.
> Teremos as factorys de iphone 11, iphoneX e a classe abstrata IphoneFactory que receberão por parâmetro a regra utilizada pelo país

* Iphone factory

![](images/iphoneFactoryAbstractFactory.png)

* IphoneX Factory
  
![](images/iphoneXFactoryAbstractFactory.png)

> Agora chegamos nas AbstractFactorys que englobam as regras de cada país

* Interface Regras do País 

![](images/countryRulesAbstractFactory.png)

* Classe concreta de regras no Brasil
  
![](images/brazilianRulesAbstractFactory.png)

> No cliente é necessário instanciar apenas a regra do país desejado e após isso
> criar o iphone com a regra desejada. Dessa forma se surgissem novos países era apenas 
> necessário criar suas regras de empacotamento, certificado e criar sua abstractFactory.

* Cliente

![](images/clienteAbstractFactory.png)

-----
# Padrões de Projetos Estruturais
> Objetos podem se unir em estruturas maiores. Porém de forma organizada, facilitando possíveis extensões

# Padrões de Projetos Comportamentais
> Organizar a forma de comunicação entre os objetos
