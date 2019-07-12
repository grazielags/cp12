Algoritmo "Exercicio10"
//Dados três valores A, B e C, verifique se eles podem
//ser os comprimentos dos lados de um triângulo,
//se forem, verificar o tipo do triângulo.
//Se os lados não formarem um triângulo,
//escrever uma mensagem.
//O comprimento de cada lado em um triângulo é menor
//que a soma dos outros dois lados;
//Equiláteros: tem os comprimentos dos três lados
//iguais;
//Isósceles: tem os comprimentos de dois lados iguais;
//Escaleno: tem os comprimentos dos três lados
//diferentes

Var
   a, b, c: inteiro
Inicio
   Escreva("Digite o valor do lado a: ")
   Leia(a)
   Escreva("Digite o valor do lado b: ")
   Leia(b)
   Escreva("Digite o valor do lado c: ")
   Leia(c)
   se (a < (b + c)) E (b < (a + c)) E (c < (a + b)) entao
      se (a = b) E (a = c) E (b = c) entao
         Escreval("O triângulo é Equilátero!")
      senao
           se (a <> b) E (a <> c) E (b <> c) entao
              Escreval("O triângulo é Escaleno!")
           senao
              Escreval("O triângulo é Isósceles!")
           fimse
      fimse
   senao
        Escreval("Não é um triângulo!")
   fimse
Fimalgoritmo