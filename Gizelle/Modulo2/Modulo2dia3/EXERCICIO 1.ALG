Algoritmo "EXERCICIO 1"

//Somar os valores digitados enquanto o valor for par. No fim do algoritmo
//apresentar os valores da soma.

Var

soma, valor, resultado : inteiro

Inicio

      soma := 0
      escreva ("Digite um n�mero: ")
      Leia (valor)

     enquanto valor mod 2 = 0 faca
         soma <- soma + valor
         escreval ("A soma dos n�meros pares at� agora �: ",soma)
         escreva ("Digite um n�mero: ")
         leia (valor)
     fimenquanto

escreval (" ")
escreval("Resultado final: ", soma)


Fimalgoritmo