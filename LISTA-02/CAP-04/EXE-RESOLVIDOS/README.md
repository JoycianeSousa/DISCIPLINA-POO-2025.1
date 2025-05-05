# **Questões Resolvidas**

 *[Q01](Q01)-A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. A média das três notas mencionadas obedece aos pesos a seguir:

|        NOTA            |   PESO  |
|------------------------|---------|
|trabalho de laboratorio |    2    |
|avaliação semestral     |    3    |
|exame final             |    5    |

Faça um programa que receba as três notas, calcule e mostre a média ponderada e o conceito que segue
a tabela:

|  MÉDIA PONDERADA  |  MÉDIA    | CONCEITO |
|-------------------|-----------|----------|
|8,0  ●──────────── |   10,0    |     A    |
|7,0  ●───────────  |   8,0     |     B    |
|6,0  ●──────────   |   7,0     |     C    |
|5,0  ●────────     |   6,0     |     D    |
|0,0  ●───────      |   5,0     |     E    |

**Solução:**
ALGORITMO
DECLARE nota_trab, aval_sem, exame, media NUMÉRICO
ESCREVA “Digite a nota do trabalho de laboratório: “
LEIA nota_trab
ESCREVA “Digite a nota da avaliação semestral: “
LEIA aval_sem
ESCREVA “Digite a nota do exame final: “
LEIA exame
media ← (nota_trab * 2 + aval_sem * 3 + exame * 5) / 10
ESCREVA “Média ponderada: “ , media
SE media >= 8 E media <= 10
ENTÃO ESCREVA “Obteve conceito A”
SE media >= 7 E media < 8
ENTÃO ESCREVA “Obteve conceito B”
SE media >= 6 E media < 7
ENTÃO ESCREVA “Obteve conceito C”
SE media >= 5 E media < 6
ENTÃO ESCREVA “Obteve conceito D”
SE media >= 0 E media < 5
ENTÃO ESCREVA “Obteve conceito E”
FIM_ALGORITMO.
