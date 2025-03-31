# Projeto: Manipulação de Matriz 5x5

## Descrição

Este é um projeto em Java que cria uma matriz 5x5 preenchida com números inteiros aleatórios entre 0 e 5, utilizando a classe `Random`. O programa exibe a matriz completa e, em seguida, destaca diferentes partes dela, como a diagonal principal, a diagonal secundária, os triângulos superior e inferior em relação a essas diagonais, e outras variações. Para facilitar a visualização, os elementos que não pertencem à parte destacada são substituídos por "-".

- **Parâmetros da Matriz:**
  - Tamanho: 5 linhas x 5 colunas.
  - Valores: Números inteiros aleatórios de 0 a 5.

- **Resultados Exibidos:**
  - Matriz completa.
  - Diagonal principal.
  - Triângulo superior e inferior à diagonal principal.
  - Matriz sem a diagonal principal.
  - Diagonal secundária.
  - Triângulo superior e inferior à diagonal secundária.
  - Matriz sem a diagonal secundária.

## Saída Esperada

Ao executar o programa, você verá uma saída no console semelhante a esta (os valores variam devido à geração aleatória):

```
Matriz:
3 1 4 2 5
0 2 3 1 4
1 5 2 0 3
4 3 1 2 0
2 1 0 4 5

Diagonal Principal:
3 - - - -
- 2 - - -
- - 2 - -
- - - 2 -
- - - - 5

Triângulo superior à diagonal principal:
- 1 4 2 5
- - 3 1 4
- - - 0 3
- - - - 0
- - - - -

Triângulo inferior à diagonal principal:
- - - - -
0 - - - -
1 5 - - -
4 3 1 - -
2 1 0 4 -

Retirando a Diagonal principal:
- 1 4 2 5
0 - 3 1 4
1 5 - 0 3
4 3 1 - 0
2 1 0 4 -

Diagonal secundária:
- - - - 5
- - - 1 -
- - 2 - -
- 3 - - -
2 - - - -

Triângulo superior à diagonal secundária:
- - - - -
- - - - 4
- - - 0 3
- - 1 2 0
- 1 0 4 5

Triângulo inferior à diagonal secundária:
3 1 4 2 -
0 2 3 - -
1 5 - - -
4 - - - -
- - - - -

Tudo exceto a diagonal secundária:
3 1 4 2 -
0 2 3 - 4
1 5 - 0 3
4 - 1 2 0
- 1 0 4 5
```

## Explicação do Código

**Sua Tarefa:** Explique o código detalhadamente, linha por linha, para demonstrar seu entendimento da lógica de programação em Java. Foque em como a matriz é preenchida, como as condições para cada seção são definidas, e como a saída é gerada.

## Aprendizados

Nesta seção, você pode descrever o que aprendeu ao criar este programa. Aqui estão algumas sugestões do que você pode incluir:

- **Matrizes Bidimensionais:** Como criar e manipular uma matriz 5x5 em Java.
- **Geração Aleatória:** Como usar a classe `Random` para gerar valores em um intervalo específico (0 a 5).
- **Loops Aninhados:** Como usar `for` aninhados para percorrer e manipular elementos de uma matriz.
- **Condicionais Complexas:** Como usar `if` e `else` para destacar partes específicas da matriz, como diagonais e triângulos.
- **Lógica de Índices:** Como identificar a diagonal principal (`i == j`) e a diagonal secundária (`j == mat.length - 1 - i`).
- **Formatação Visual:** Como usar caracteres como "-" para melhorar a visualização das seções da matriz.
- **Resolução de Problemas:** Como dividir um problema maior (exibir diferentes partes da matriz) em etapas menores.