Algoritmo "EXERCICIO 2 COM - M2D4"
//Para tentar descobrir se um dado � viciado, crie um algoritmo que solicite
//10 vezes o n�mero de 1 at� 6 (n�meros poss�veis de um dado).
//Ap�s informado os 10 resultados dos lan�amentos do dado, determinar o n�mero
//de ocorr�ncias de cada n�mero desse dado, por exemplo:
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
                      escreval ("N�MERO INV�LIDO")
     fimescolha
fimpara
        escreval ("TOTAL DE REPETI��ES")
        escreval ("1:", V[1], " vez(es)")
        escreval ("2:", V[2], " vez(es)")
        escreval ("3:", V[3], " vez(es)")
        escreval ("4:", V[4], " vez(es)")
        escreval ("5:", V[5], " vez(es)")
        escreval ("6:", V[6], " vez(es)")

fimalgoritmo
