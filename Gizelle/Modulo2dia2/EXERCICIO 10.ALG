Algoritmo "exercicio 10"
// Dados três valores A, B e C, verifique se eles podem ser os comprimentos
//dos lados de um triângulo, se forem, verificar o tipo do triângulo.
//Se os lados não formarem um triângulo, escrever uma mensagem.
//O comprimento de cada lado em um triângulo é menor que a soma dos outros dois lados;
//Equiláteros: tem os comprimentos dos três lados iguais;
//Isósceles: tem os comprimentos de dois lados iguais;
//Escaleno: tem os comprimentos dos três lados diferentes

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
   //só segue neste caminho se o se acima for verdadeiro, senão
   //passa direto para o último senaõ e acaba a leitura.
      Escreval ("Triângulo equilátero!")
   senao
        se (a<>b) e (b<>c) e (c<>b) entao
             Escreva ("Triangulo Escaleno!")
        senao
             Escreval ("Triângulo Isósceles!")
        fimse
   fimse
senao
     Escreval ("Os 3 valores de lados não representam um triangulo!")
fimse

Fimalgoritmo