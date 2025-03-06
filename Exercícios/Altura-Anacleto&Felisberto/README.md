# Projeto: Crescimento de Anacleto e Felisberto

## Descrição

Este é um projeto simples em Java que calcula quantos anos são necessários para que Felisberto, que começa com uma altura menor mas cresce mais rápido, ultrapasse Anacleto em altura.

- **Alturas Iniciais:**
  - Anacleto: 150 cm
  - Felisberto: 110 cm

- **Taxas de Crescimento Anual:**
  - Anacleto: 2 cm por ano
  - Felisberto: 3 cm por ano

O resultado do programa é o número de anos necessários para que Felisberto se torne mais alto que Anacleto.

## Saída Esperada

Ao executar o programa, você verá uma mensagem no console indicando quantos anos foram necessários. Por exemplo:

```
Foram necessários 41 anos para que Felisberto se tornasse maior que Anacleto.
```

## Explicação do Código

- Variáveis
	- alturaAnacleto: Altura inicial de Anacleto (150 cm), representada como double.
	- alturaFelisberto: Altura inicial de Felisberto (110 cm), representada como double.
	- passoAno: Contador de anos, inicializado em 0, representado como int.

- Lógica de programação

	- While loop: Inicia mediante a condição que "alturaFelisberto" seja menor ou igual a "alturaAnacleto", o objetivo do loop é calcular o crescimento de ambos, sendo cada ação do While loop correpondente a um ano, e ao final com a variável passoAno, descobrir quantos anos forma necessários para que Felisberto ficasse maior que Ancleto.

	- Operações dentro do While Loop: Dentro do while loop a cada ativação Anacleto recebe +2 de altura, que corresponde á 2cm, Felisberto recebe +3 que corresponde á 3cm de altura, e é acrescentado +1 de valor a variável passoAno.

	- Ao final o programa imprime através da variável passoAno, quantos anos forma necessários para que Felisberto ultrapassasse em altura o Anacleto.
