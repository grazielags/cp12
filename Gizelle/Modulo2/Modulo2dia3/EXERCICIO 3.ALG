Algoritmo "exercicio 3"
// Escrever um algoritmo que leia valores para m e n e que calcule a soma
//dos valores entre o menor valor de m e n e o maior valor de m e n.

Var
m, n, maior, menor, i, soma : inteiro

Inicio
escreva ("Digite um valor para M: ")
leia (M)
escreva ("Digite um valor para N: ")
leia (N)
escreval (" ")
    se M>N entao
             maior <-M
             menor <-N
             Escreval("Menor é o N com", menor, " e o maior é o M com", maior)
          senao
             menor <-M
             maior <-N
             Escreval("Menor é o M com", menor, " e o maior é o N com", maior)
          fimse

     para i de menor ate maior passo 1 faca
            soma <- soma+i
     fimpara
     Escreval (" ")
     Escreval ("Soma dos valores entre eles é: ", soma)

Fimalgoritmo