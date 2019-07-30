Algoritmo "EXERCICIO 2 COM - M2D4"
//Para tentar descobrir se um dado é viciado, crie um algoritmo que solicite
//10 vezes o número de 1 até 6 (números possíveis de um dado).
//Após informado os 10 resultados dos lançamentos do dado, determinar o número
//de ocorrências de cada número desse dado, por exemplo:
//1 - Saiu 6 vezes;
//2 - Saiu 1;
//3 - Saiu 2;
//4 - Saiu 0;
//5 - Saiu 0;
//6 - Saiu 1

var
V: vetor [1..6] de inteiro
N,i: inteiro

inicio
N <- 0
I <- 0
para i de 1 ate 10 passo 1 faca
     escreva ("Digite valor do dado: ")
     leia (V[i])
     escolha V[i]
             caso 1 N(1) <- V[i] + 1
             // sitaxe errada
             caso 2 V[2] <- V[i] + 1
             caso 3 V[3] <- V[i] + 1
             caso 4 V[4] <- V[i] + 1
             caso 5 V[5] <- V[i] + 1
             caso 6 V[6] <- V[i] + 1
             outrocaso
                      escreval ("NÚMERO INVÁLIDO")
     fimescolha
fimpara
        escreval ("TOTAL DE REPETIÇÕES")
        escreval ("1:", V[1], " vez(es)")
        escreval ("2:", V[2], " vez(es)")
        escreval ("3:", V[3], " vez(es)")
        escreval ("4:", V[4], " vez(es)")
        escreval ("5:", V[5], " vez(es)")
        escreval ("6:", V[6], " vez(es)")

fimalgoritmo
