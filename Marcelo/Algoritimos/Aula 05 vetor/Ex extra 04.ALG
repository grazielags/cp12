Algoritmo "semnome"
// Ler um vetor com 10 nomes de pessoas, ap�s pedir que o usu�rio digite
// um nome qualquer de
//pessoa. Escrever a mensagem �ACHEI�, se o nome estiver armazenado
// no vetor ou �N�O ACHEI�
//caso contr�rio.
Var
   nomes : vetor [1..2] de caracter
   i : inteiro
   nome:caracter
Inicio

   para i de 1 ate 2 faca
      Escreval (" nomes : " )
      leia(nomes[i])
   fimpara

   Escreval ("Quem vc procura  ?")
   leia(nome)

   se nome = (nomes[i]) entao
      Escreval ("Achei")
   senao
      se nome <> nomes[i]  entao
         Escreval ("N�o achei")
      fimse
    fimse

Fimalgoritmo