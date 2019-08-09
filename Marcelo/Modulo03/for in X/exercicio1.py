'''1) Imprimir a quantidade de números pares entre dois números solicitados
para o usuário.
'''

numero1= int(input("Escreva um numero"))
numero2= int(input("Escreva outro numero"))
par=0
while numero1<=numero2:
   if numero1 %2 ==0:
       par+=1
   numero1+=1  

print(par)  
