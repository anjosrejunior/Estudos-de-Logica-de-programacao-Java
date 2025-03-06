# Projeto: Cálculo da Área de um Círculo

## Descrição

Este é um projeto simples em Java que calcula a área de um círculo com base no raio fornecido pelo usuário. O programa utiliza a classe `Scanner` para receber a entrada do usuário e a constante `Math.PI` junto com o método `Math.pow` para realizar o cálculo da área, que é exibida com duas casas decimais.

- **Fórmula da Área:**  
  A área do círculo é calculada como `π * raio²`, onde `π` é uma constante matemática aproximada (disponível em `Math.PI`).

- **Funcionalidade:**  
  O usuário insere o valor do raio, e o programa retorna a área correspondente.

## Saída Esperada

Ao executar o programa, você verá uma interação no console como esta:

```
Escreva o raio do circulo: 5
Esta é a area do circulo que você forneceu o raio: 78.54
```

(Neste exemplo, o usuário forneceu o raio 5, e a área calculada foi formatada para duas casas decimais.)

## Explicação do Código

OBS: Como é um código simples eu prefiri declarar as variáveis em execução apenas para deixar o código mais enxuto.

- Chamando objeto *Scanner*: Primeiramente eu crio o objeto *Scanner*, da biblioteca *java.util* para que eu possa ler um input do teclado e colocar ele em uma variável. (Lembrando que ao final é uma boa prática fechar o Scanner "scan.close();").

- Pedindo input do usuário: imprimo uma mensagem na tela pedindo input do usuário e crio uma variável double chamada raio e uso o *Scan*, para inserir o input do usuário pelo teclado dentro da variável *raio*.

- Fazendo o cálculo da Area: Dentro desta etapa eu utilizo duas funções da biblioteca *Math*, eu utilizo o *Math.PI*, trazendo o número PI para ser multiplicado pela próxima operação, o *Math.pow* faz a potência do raio por dois, e assim calcula a área do círculo.

- Imprimindo o resultado: Ao final imprimo o resultado da operação utilizando a classe *System*, do pacote *java.lang*.