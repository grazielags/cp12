Algoritmo "tres"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi 
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/07/2019
Var
idade: inteiro
nome: caracter
a,b,c,d: logico
altura: real
questao: caracter



Inicio
Escreva("Informe seu nome:")
Leia(nome)
Escreva("Quantos anos voc� tem?")
Leia(idade)
Escreva("Informe sua altura:")
Leia(altura)
Escreval("Escolha a quest�o do exame final efetuados para saber se a mesma � verdadeira:")
a<-((6<9) e (9<19))
b<-((3<2) ou (2<1))
c<-((3<5) ou (2>10))
d<-((3<5) e (2>10))
Escreval("a)(6<9)e(9<19)")
Escreval("b)(3<2)ou(2<1)")
Escreval("c)(3<5)ou(2>10)")
Escreval("d)(3<5)e(2>10)")
Leia(questao)
se questao=a entao
   Escreva(a)
senao
     se quest�o=b entao
        Escreva(b)
     senao
          se questao=c entao
             Escreva(c)
          senao
               se questao=d entao
                  Escreva(d)
               fimse
          fimse
      fimse
fimse
Escreval()
Escreval("Confirme seus dados:")
Escreval("Nome:", nome, ", Idade:", idade, ", Altura:", altura, " Quest�o escolhida:", questao)

Fimalgoritmo