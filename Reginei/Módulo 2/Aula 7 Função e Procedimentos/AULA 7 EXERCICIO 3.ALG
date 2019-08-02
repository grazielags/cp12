Algoritmo "aula 7 exercicio 3"
//3. Escreva uma função que retorna o número maior de 2 números
//obtidos do usuário

Var

   num1, num2, maior: inteiro
funcao maiorValor(): inteiro

Inicio
   se num1 > num2 entao
      retorne num1
   senao
      retorne num2
   fimse
   escreval
fimfuncao
inicio
escreva("Digite o Primeiro Número: ")
leia(num1)
escreva("Digite o segundo Número: ")
leia(num2)
maior <- maiorValor()
escreval("O maior Número entre ",num1," e",num2," é:", maiorValor)



Fimalgoritmo