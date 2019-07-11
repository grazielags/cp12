algoritmo "Expoente"
var
   i, resultado, base, expoente : inteiro
inicio
      escreva("Digite a base: ")
      leia(base)
      escreva("Digite o expoente: ")
      leia(expoente)
      resultado <- base
      para i de 1 ate (expoente - 1) passo 1 faca
           resultado <- (resultado * base)
      fimpara
      escreval(resultado)
fimalgoritmo