Algoritmo "semnome"
// Escreva um algoritmo de um calculadora, que ir� solicitar ao usu�rio
//qual opera��o deseja realizar. De acordo com a opera��o desejada
//ser� chamado um procedimento diferente que obter� 2 valores,
//realizar� o c�lculo da opera��o informado e escrever� o resultado.
Var
a,b: inteiro
operacao: caracter
procedimento somaoperacao ()
inicio
    escolha operacao
     caso "+"
        soma()
     caso "-"
        subtracao()
     caso "/"
        divisao ()
     caso  "*"
        multiplicacao()
    fimescolha
fimprocedimento

procedimento soma ()
inicio
     Escreval( a+b )
fimprocedimento

procedimento subtracao ()
inicio
      Escreval (a-b)
fimprocedimento

procedimento divisao ()
inicio
    Escreval (a/b)
fimprocedimento

procedimento multiplicacao ()
inicio
    Escreval (a*b)
fimprocedimento

Inicio
  Escreval ("Escreva o valor A ")
  leia(a)
  Escreval ("Escreva o valor B ")
  leia(b)
  Escreval("Escreva qual a opera��o que desejas    :")
  leia(operacao)
  somaoperacao ()

Fimalgoritmo