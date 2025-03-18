# Projeto: Análise de Matriz 10x10

## Descrição

Este é um projeto em Java que cria uma matriz 10x10 preenchida com números inteiros aleatórios entre 0 e 9, utilizando a classe `Random`. O programa calcula o maior e o menor valor de cada linha da matriz e exibe a matriz completa, seguida pelos maiores e menores números de cada linha.

- **Parâmetros da Matriz:**
  - Tamanho: 10 linhas x 10 colunas.
  - Valores: Números inteiros aleatórios de 0 a 9.

- **Resultados Calculados:**
  - Maior valor de cada linha.
  - Menor valor de cada linha.

## Saída Esperada

Ao executar o programa, você verá uma saída no console semelhante a esta (os valores variam devido à geração aleatória):

Esta sáida é apenas um exemplo, poi os números gerados são "aleatórios", este é apenas um exemplo de como o código deve funcionar.

```
----- Matriz -----
3 7 1 4 8 2 9 5 6 0
4 2 8 1 6 3 9 7 5 0
[... mais 8 linhas ...]

----- Maiores Números das Linhas -----
Maior número da linha 0: 9
Maior número da linha 1: 8
[...]

----- Menores Números das Linhas -----
Menor número da linha 0: 1
Menor número da linha 1: 2
[...]
```

## Explicação do Código

- **Criando as variáveis e instancias**: Primeiro instanciamos a classe Random para cirar números pseudoaleatórios, depois declaramos as matrizes necessárias para responder as perguntas deste exercício.
*Linhas: 5 á 9.* 

- **Preenchendo a Matriz**: Criamos um for loop aninhando com outro for loop para precorrer as linhas e colunas da matriz, preenchendo cada posição com um número inteiro randômico. 
*Linhas: 11 á 15.*

- **Estruturando a lógica de busca**: Com dois for loop aninhandos novamente usando condições de if, eu crio uma lógica que é a posição do "i" que representa as linhas muda após percorrer todas as colunhas que são representadas por "j", dentro da matriz bidimensional, os vetores "maiores" e "menores", tem como indíce a "i". 
*Linhas: 17 á 26.* 

- **Buscando maior e menor número**: Para encontrar o maior e menor número de cada linha usamos um a condição simples de if, enquanto a lógica anterior estiver percorrendo toda a matriz, as condições de if, se "maiores[i]" for menor "<" que "mat[i][j]", então o vetor recebe o valor da matriz, sendo a codição inversa para validar se o menor valor, se "menores[i]" for maior que a o valor contido na matriz então ele vai receber o valor contido na matriz. 
*Linhas : 19 á 24.*

- **Imprimindo resultados**: Desta parte em frente apenas escrevo um código com for loops aninhandos, para percorrer toda a matriz imprimindo ela. Após isso crio dois for loops percorrendo os vetores "maiores" e "menores", imprimindo o valor maior e menor de cada linha da matriz de 10x10.
*Linhas : 36 á 44.*


## Aprendizados

- **Loops Aninhados:** Como utilizar `for` aninhados para percorrer linhas e colunas de uma matriz.
- **Comparações Lógicas:** Como usar `if` para identificar os maiores e menores valores em cada linha.
- **Exibição de Dados:** Como formatar e imprimir uma matriz e arrays de forma organizada no console.
- **Debugging:** Como identificar e corrigir erros, como a impressão incorreta dos menores valores.