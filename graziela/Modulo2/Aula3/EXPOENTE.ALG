algoritmo "Expoente"
var
   i, resultado, base, expoente : inteiro
inicio
      escreva("Digite a base: ")
      leia(base)
      escreva("Digite o expoente: ")
      leia(expoente)
      resultado <- 1
      para i de 1 ate expoente passo 1 faca
           resultado <- (resultado * base)
      fimpara
      escreval(resultado)
fimalgoritmo