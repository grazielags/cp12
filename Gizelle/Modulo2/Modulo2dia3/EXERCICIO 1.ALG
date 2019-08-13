Algoritmo "EXERCICIO 1"

//Somar os valores digitados enquanto o valor for par. No fim do algoritmo
//apresentar os valores da soma.

Var

soma, valor, resultado : inteiro

Inicio

      soma := 0
      escreva ("Digite um número: ")
      Leia (valor)

     enquanto valor mod 2 = 0 faca
         soma <- soma + valor
         escreval ("A soma dos números pares até agora é: ",soma)
         escreva ("Digite um número: ")
         leia (valor)
     fimenquanto

escreval (" ")
escreval("Resultado final: ", soma)


Fimalgoritmo