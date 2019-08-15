'''
1. Faça um programa que leia dois vetores de 3 posições, que
representam forças sobre um ponto no espaço 3D, e escreva a
força resultante
Dica: força resultante é obtida pela soma dos valores das
coordenadas correspondentes nos dois vetores: (x1 + x2), (y1 +
y2), (z1 + z2)

'''
vetorx = []
vetory = []
soma = []
for i in range(3):
       vetorx.append(eval(input('Digite o vetorx"[ + str(i) + "]: ')))
       vetory .append(eval(input('Digite o vetor y: ')))
       soma.append(vetorx[i] + vetory[i])
            
for i in range(3):
       #print(vetorx[i],"+", vetory[i],"=",soma[i])
      print(vetorx[i]," + ", vetory[i], " = ", vetorx[i] + vetory[i])

