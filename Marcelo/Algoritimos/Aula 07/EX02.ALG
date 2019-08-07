Algoritmo "semnome"
// Escreva um algoritmo de um calculadora, que irá solicitar ao usuário
//qual operação deseja realizar. De acordo com a operação desejada
//será chamado um procedimento diferente que obterá 2 valores,
//realizará o cálculo da operação informado e escreverá o resultado.
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
  Escreval("Escreva qual a operação que desejas    :")
  leia(operacao)
  somaoperacao ()

Fimalgoritmo