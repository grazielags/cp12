algoritmo "SomaEQuantidadeValoresParImpar"
var
   i, numero, somaPar, somaImpar, qtdPar, qtdImpar : inteiro
inicio
      para i de 1 ate 100 passo 1 faca
           Escreva("Digite um número: ")
           leia(numero)
           se numero MOD 2 = 0 entao
                somaPar <- numero + somaPar
                qtdPar <- qtdPar + 1
           senao
                somaImpar <- numero + somaImpar
                qtdImpar <- qtdImpar + 1
           fimse
      fimpara
      escreval("Soma dos valores par: ", somaPar)
      escreval("Soma dos valores ímpar: ", somaImpar)
      escreval("Quantidade par: ", qtdPar)
      escreval("Quantidade ímpar: ", qtdImpar)
fimalgoritmo