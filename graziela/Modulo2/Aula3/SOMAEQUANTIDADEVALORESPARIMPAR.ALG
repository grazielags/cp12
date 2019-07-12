algoritmo "SomaEQuantidadeValoresParImpar"
var
   i, numero, qtd, somaPar, somaImpar, qtdPar, qtdImpar : inteiro
inicio
      Escreva("Digite a quantidade de elementos que deseja: ")
      Leia(qtd)
      para i de 1 ate qtd passo 1 faca
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