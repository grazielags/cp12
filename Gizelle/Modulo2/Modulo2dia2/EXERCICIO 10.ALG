Algoritmo "exercicio 10"
// Dados tr�s valores A, B e C, verifique se eles podem ser os comprimentos
//dos lados de um tri�ngulo, se forem, verificar o tipo do tri�ngulo.
//Se os lados n�o formarem um tri�ngulo, escrever uma mensagem.
//O comprimento de cada lado em um tri�ngulo � menor que a soma dos outros dois lados;
//Equil�teros: tem os comprimentos dos tr�s lados iguais;
//Is�sceles: tem os comprimentos de dois lados iguais;
//Escaleno: tem os comprimentos dos tr�s lados diferentes

Var
A, B, C: inteiro



Inicio
escreva ("Digite lado A: ")
leia (A)
escreva ("Digite lado B: ")
leia (B)
escreva ("Digite lado C: ")
leia (C)

Se (A < (B + C)) e (b < (A + C)) e (C < (A + B)) entao
   se (a = b) e (b = c) e (a = c) entao
   //s� segue neste caminho se o se acima for verdadeiro, sen�o
   //passa direto para o �ltimo sena� e acaba a leitura.
      Escreval ("Tri�ngulo equil�tero!")
   senao
        se (a<>b) e (b<>c) e (c<>b) entao
             Escreva ("Triangulo Escaleno!")
        senao
             Escreval ("Tri�ngulo Is�sceles!")
        fimse
   fimse
senao
     Escreval ("Os 3 valores de lados n�o representam um triangulo!")
fimse

Fimalgoritmo