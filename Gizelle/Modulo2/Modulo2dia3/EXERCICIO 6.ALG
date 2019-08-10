Algoritmo "EXEMPLO 4"
//Escreva um algoritmo que leia 2 valores X e Y e que calcule X na
//potência Y.

Var
I, RESULTADO, X, Y : INTEIRO


Inicio

ESCREVA("DIGITE VALOR X:  ")
LEIA (X)
ESCREVA ("DIGITE VALOR PARA Y: ")
LEIA (Y)
RESULTADO <- X
PARA I DE 1 ATE (Y - 1) PASSO 1 FACA
     RESULTADO <- (RESULTADO * X)
FIMPARA
     ESCREVAL (RESULTADO)

Fimalgoritmo