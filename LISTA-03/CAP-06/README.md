
1-Faça um programa que preencha um vetor com nove números inteiros, calcule e mostre os números
primos e suas respectivas posições.

2. Uma pequena loja de artesanato possui apenas um vendedor e comercializa dez tipos de objetos. O
vendedor recebe, mensalmente, salário de R$ 545,00, acrescido de 5% do valor total de suas vendas.
O valor unitário dos objetos deve ser informado e armazenado em um vetor; a quantidade vendida de
cada peça deve ficar em outro vetor, mas na mesma posição. Crie um programa que receba os preços
e as quantidades vendidas, armazenando-os em seus respectivos vetores (ambos com tamanho dez).
Depois, determine e mostre:
■■ um relatório contendo: quantidade vendida, valor unitário e valor total de cada objeto. Ao final,
deverão ser mostrados o valor geral das vendas e o valor da comissão que será paga ao vendedor; e
■■ o valor do objeto mais vendido e sua posição no vetor (não se preocupe com empates).

Faça um programa que preencha dois vetores de dez elementos numéricos cada um e mostre o vetorresultante
da intercalação deles.
Vetor 1= 3 5 4 2 2 5 3 2 5 9
1 2 4 4 5 6 7 8 9 10
Vetor 2 =7 15 20 0 18 4 55 23 8 6
1 2 4 4 5 6 7 8 9 10

Vetor resultante da intercalação

3 7 5 15 4 20 2 0 2 18 5 4 3 55 2 23 5 8 9 6
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

4.Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores

resultantes. O primeiro vetor resultante deve conter os números positivos e o segundo, os números ne-
gativos. Cada vetor resultante vai ter, no máximo, oito posições, que não poderão ser completamente utilizadas.

5.Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre
os seguintes vetores resultantes:
■■ A união de X com Y
(todos os elementos de X e de Y sem repetições).
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
União 3 8 4 2 1 6 7 11 9 5 12 0
1 2 3 4 5 6 7 8 9 10 11 12
■■ A diferença entre X e Y
(todos os elementos de X que não existam em Y, sem repetições).
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Diferença 8 7 11 9
1 2 3 4

■■ A soma entre X e Y
(soma de cada elemento de X com o elemento de mesma posição em Y).
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Soma 5 9 9 14 4 6 9 11 16 15
1 2 3 4 5 6 7 8 9 10
■■ O produto entre X e Y
(multiplicação de cada elemento de X com o elemento de mesma posição em Y).
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
PASCAL
C/C++
JAVA

06 asc0711_CAP06 BR.indd 162 4/26/12 10:45 AM

Capítulo 6 Vetor | 163

y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Produto 6 8 20 24 3 0 8 28 55 54
1 2 3 4 5 6 7 8 9 10
■■ A intersecção entre X e Y
(apenas os elementos que aparecem nos dois vetores, sem repetições).
x 3 8 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
y 2 1 5 12 3 0 1 4 5 6
1 2 3 4 5 6 7 8 9 10
Intersecção 3 4 2 1 6
1 2 3 4 5


6. Faça um programa que preencha um vetor com dez números inteiros, calcule e mostre o vetor resul-
tante de uma ordenação decrescente.

x 3 5 4 2 1 6 8 7 11 9
1 2 3 4 5 6 7 8 9 10
Ordenado 11 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 10

7.Faça um programa que, no momento de preencher um vetor com oito números inteiros, já os armazene
de forma crescente.

8. Faça um programa que preencha dois vetores com cinco elementos numéricos cada e, depois, ordene-
-os de maneira crescente. Deverá ser gerado um terceiro vetor com dez posições, composto pela junção
dos elementos dos vetores anteriores, também ordenado de maneira crescente.
x 6 8 1 10 3
1 2 3 4 5
X 1 3 6 8 10
ordenado 1 2 3 4 5
y 20 0 7 2 5
1 2 3 4 5
Y 0 2 5 7 20
Ordenado 1 2 3 4 5
Resultado 0 1 2 3 5 6 7 8 10 20
1 2 3 4 5 6 7 8 9 10


 9. Faça um programa que efetue reserva de passagens aéreas de uma companhia. O programa deverá ler
informações sobre os voos (número, origem e destino) e o número de lugares disponíveis para doze
aviões (um vetor para cada um desses dados). Depois da leitura, o programa deverá apresentar um
menu com as seguintes opções:
■■ consultar;
■■ efetuar reserva; e
■■ sair.
 Quando a opção escolhida for Consultar, deverá ser disponibilizado mais um menu com as seguintes
opções:
■■ por número do voo;
■■ por origem; e
■■ por destino.

Quando a opção escolhida for Efetuar reserva, deverá ser perguntado o número do voo em que a pes-
soa deseja viajar. O programa deverá dar as seguintes respostas:

■■ reserva confirmada — caso exista o voo e lugar disponível, dando baixa nos lugares disponíveis;
■■ voo lotado — caso não exista lugar disponível nesse voo;
■■ voo inexistente — caso o código do voo não exista.
A opção Sair é a única que permite encerrar a execução do programa. Sendo assim, após cada operação
de consulta ou reserva, o programa volta ao menu principal.

- 10. Faça um programa para corrigir provas de múltipla escolha. Cada prova tem oito questões e cada questão vale um ponto. O primeiro conjunto de dados a ser lido é o gabarito da prova. Os outros da-
dos são os números dos alunos e as respostas que deram às questões. Existem dez alunos matriculados.

Calcule e mostre:
■■ o número e a nota de cada aluno; e
■■ a porcentagem de aprovação, sabendo-se que a nota mínima é 6.
