Algoritmo "aula 7 exercicio 3"
//3. Escreva uma fun��o que retorna o n�mero maior de 2 n�meros
//obtidos do usu�rio

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
escreva("Digite o Primeiro N�mero: ")
leia(num1)
escreva("Digite o segundo N�mero: ")
leia(num2)
maior <- maiorValor()
escreval("O maior N�mero entre ",num1," e",num2," �:", maiorValor)



Fimalgoritmo