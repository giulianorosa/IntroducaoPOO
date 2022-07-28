# Introdução a Programação Orientada a Objetos (POO)

    - O que é POO?
        - Programação orientada a objeto
        - Serve para demonstrar algo da vida real dentro da aplicação

    "Não é porque está programando em POO que sua aplicação é uma POO. A programação possui regras que precisam ser exploradas para tal fato".

### Conceitos de Associação
    - Associação Utilizamos para associar alguma Classe com outra.
    - Evitamos realizar várias vezes o
### Conceitos de Herança
    - Podemos lidar com Herança tudo aquilo que está interligados em sua aplicação como um todo, sem a necessidade de "Recriar"
        - Temos uma classe Veiculos com seus atributos Roda, Porta e métodos Ligar, Desligar, Andar
            - Podemos herdar dessa Classe utilizando a palavra reservada "EXTENDS" para outras classes que utilizam todos(ou alguns desses) atributos e métodos
                - Exemplo, Carro extends veiculos utilizando todos atributos e métodos
                    - Moto extends veiculos, porém a moto segue todos métodos, mas atributos não, pois não possui PORTA.
### Conceitos de Interface
    - Seria o modo que utilizaremos uma Classe, como uma Regra de negócio para nossa aplicação.
    - Não sendo obrigatório, mas essencial para a organização da aplicação.
    
### Conceitos de Objetos
    - Objeto é tudo que conseguimos pegar em nossa vida real e transformar para o mundo computacional, utilizando Classes, Atributos e Métodos
        - Classe: Criamos uma Class de algo da vida real, seguindo boa prática de ser intuitivo e sempre iniciar com a primeiro letra Maiúscula
            - Exemplo: Pessoa
        - Atributo: Atributo são as qualidades que a classe(Objeto) que criamos em questão possua
            - Exemplo: Objeto Pessoa; Atributo Nome, Idade, Peso, Altura
        - Método são as ações que a classe(Objeto) que criamos faça
            - Exmplo: Objeto Pessoa; Método Andar, Correr, Dormir
            - OBS: Geralmente utilizamos nessa parte VERBOS, para melhor descrever a ação
### Conceitos de Pacotes(Package)
    - Pacotes são como dividimos nossa aplicação para realizar a melhor organização dentro do software/web como um todo
    - São as pastas que usamos para dividir nossa aplicação
    - Toda nossa aplicação possui um package.
    - Para utilizar um Package em outra Classe/Package, utilizamos a palavra reservada "IMPORT"
### Conceitos de Visibilidade
    - Também chamadas de "Modificador de acesso"
    - Possui 3 tipos de visibilidades: Private, Protected, Public (Default)
        - Public (Default)
            - Utiliza-se a visibilidade Public quando queremos/podemos utilizar em qualquer lugar de nossa aplicação, sendo visível em todas Classes, Pacotes e subclasses diferentes.
        - Private
            - Utiliza-se a visibilidade Private quando queremos/podemos utilizar apenas dentro da mesma Classe, não tendo visibilidades em outras Classes de mesmo pacote e subclasses.
        - Protected
            - Utiliza-se a visibilidade Protected quando podemos/queremos utilizar o atributo/método apenas dentro da mesma Classe, pacote e subclasses.