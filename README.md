# Projeto Cofrinho

Este é um projeto desenvolvido para a disciplina de Programação Orientada a Objetos em Java. O projeto consiste em um sistema que gerencia um cofrinho com moedas de diferentes países e calcula o valor total em Reais.

## Estrutura do Projeto

O projeto segue a arquitetura MVC (Model-View-Controller) e está organizado da seguinte forma:

- **src/main/java/com/seunome/projetocofrinho**
    - **model**
        - `Moeda.java`: Classe abstrata que define o template para as moedas.
        - `Dolar.java`: Classe concreta que representa a moeda Dólar.
        - `Euro.java`: Classe concreta que representa a moeda Euro.
        - `Real.java`: Classe concreta que representa a moeda Real.
        - `Cofrinho.java`: Classe que gerencia uma coleção de moedas.
    - **controller**
        - `CofrinhoController.java`: Classe que controla as operações sobre o cofrinho, como adicionar moedas e calcular o valor total em Reais.
    - **view**
        - `MainView.java`: Classe responsável pela interface com o usuário.

## Como Executar

Basta executar a classe `Main.java` localizada em `src/main/java/Main.java`.
