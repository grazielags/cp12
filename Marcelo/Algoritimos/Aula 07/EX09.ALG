Algoritmo "Parametros"
//Escreva um algoritmo que receba 2 notas por par�metro,
//calcule a m�dia das notas e escreva
//�Parab�ns voc� foi aprovado!�, caso a m�dia seja maior do que 7.

var
   nota1, nota2, resultado: inteiro
funcao resultado(nota1,nota2 : inteiro ) : inteiro
var
   resultado : inteiro
inicio
   resultado <- nota1+nota2 div 2
   retorne resultado
fimfuncao
inicio
   Escreval ("Informe a primeira nota")
   leia(nota1)
   Escreval ("Informe a segunda nota")
   leia(nota2)

   se resultado() > 7 entao
      Escreval ("Parabens voce foi aprovado")
   senao
      se resultado () < 7 entao
         Escreval ("Espera chegar em casa !!!!!!")
      fimse
   fimse
fimalgoritmo
