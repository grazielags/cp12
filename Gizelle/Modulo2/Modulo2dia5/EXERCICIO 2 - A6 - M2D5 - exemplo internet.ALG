Algoritmo "semnome"
Var
    matA: vetor [1..3,1..3] de inteiro
    matB: vetor [1..3,1..3] de inteiro
    matC: vetor [1..3,1..3] de inteiro
    i, j: inteiro
Inicio
    Escreval("Informe os valores da matriz A:")
    Para i de 1 ate 3 faca
        Para j de 1 ate 3 faca
            Escreva("Matriz A ",i , " x ",j , " : ")
            Leia(matA[i,j])
        Fimpara
    Fimpara
    Limpatela
    Escreval("Informe os valores da matriz B:")
    Para i de 1 ate 3 faca
        Para j de 1 ate 3 faca
            Escreva("Matriz B ",i , " x ",j , " : ")
            Leia(matB[i,j])
        Fimpara
    Fimpara
    Limpatela
    Para i de 1 ate 3 faca
        Para j de 1 ate 3 faca
            matC[i,j] <- ( matA[i,1] * matB[1,j] ) + (matA[i,2] * matB[2,j] ) + (matA[i,3] * matB[3,j] )
            Escreval("Matriz C ",i , " x ",j , " : ", matC[i,j])
        Fimpara
    Fimpara
Fimalgoritmo