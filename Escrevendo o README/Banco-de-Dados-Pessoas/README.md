# Projeto: Análise Estatística de Alturas

## Descrição

Este é um projeto em Java que simula e analisa dados de altura de 50 pessoas, gerando sexo (masculino ou feminino) e alturas aleatoriamente. O programa calcula estatísticas como a maior e menor altura geral, a média de altura das mulheres, a quantidade de homens, e os percentuais de homens e mulheres no grupo. Os dados são gerados usando a classe `Random`, e os resultados são formatados com duas casas decimais usando `DecimalFormat`.

- **Parâmetros de Simulação:**
  - Sexo: Gerado aleatoriamente como "M" (masculino) ou "F" (feminino).
  - Altura: Valores aleatórios entre 1,50 m e 2,00 m.

- **Resultados Calculados:**
  - Maior e menor altura entre todas as pessoas.
  - Média de altura das mulheres.
  - Quantidade de homens.
  - Percentual de homens e mulheres no grupo.

## Saída Esperada

Ao executar o programa, você verá uma saída no console semelhante a esta (os valores variam devido à geração aleatória):

```
Está é a maior altura: 1.98
Está é a menor altura: 1.52
Esta é a média de altura das mulheres: 1.75
Esta é a quantidade de Homens: 24
Os homens correspondem á: 48.00%
As mulheres correspondem á: 52.00%
```

## Explicação do Código

- **Importando Bibliotecas**: Primeiramente faço o import do Random(Para criar funções com resultados Aleatórios) e Decimal Format(Para formatar números com casas decimais).

- **Declarando variáveis**: Agora declaro as variáveis necessárias para o projeto incialmente.

- Lógica de Programação

  - **Criando valores Randômicos**: Nesta etapa eu crio valores randômicos para os arrays que armazenam o sexo e a altura.

  - **Descobrindo a menor e maior altura**: Criando um for loop para percorrer completamente os vetores, e com condições eu insiro dentro de uma variável a maior altura e dentro de outra variável a menor altura.

  - **Descobrindo a quantidade de "M" e "F", e a soma das alturas das mulheres**: Criando um for loop para percorrer novamente os vetores, mas agora com condições buscando saber a quantidade de homens, mulheres, e a soma da altura de todas as mulheres.

  - **Calculos**: Através de todos os dados obtidos anteriormente, o programa faz o cálculo da média de altura das mulheres

- ****


## Aprendizados

- **Geração Aleatória:** Como usar a classe `Random` para simular dados, como sexo e alturas em um intervalo específico.
- **Formatação de Números:** Como usar `DecimalFormat` para limitar casas decimais na exibição dos resultados.