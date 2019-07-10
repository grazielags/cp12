Algoritmo "condicional exercicio 4"
Var
   num1 ,num2 ,num3 ,num4 ,num5 ,maior , menor:inteiro
Inicio
   escreva("Digite 1º numero: ")
   leia(num1)
   maior <- num1
   menor <- num1
   escreva("digite 2º numero: ")
   leia(num2)
   se num2 > maior entao
      maior <- num2
   fimse
   se num2 < menor entao
      menor <- num2
   fimse
   escreva("digite 3º numero: ")
   leia(num3)
   se num3 > maior entao
      maior <- num3
   fimse
   se num3 < menor entao
      menor <- num3
   fimse
   escreva("digite 4º numero: ")
   leia(num4)
   se num4 > maior  entao
      maior <- num4
   fimse
   se num4 < menor entao
      menor <- num4
   fimse
   escreva("digite 5º numero: ")
   leia(num5)
   se num5 > maior entao
      maior <- num5
   fimse
   se num5 < menor entao
      menor <- num5
   fimse
   escreval("maior: ", maior, " menor: " ,menor)
Fimalgoritmo