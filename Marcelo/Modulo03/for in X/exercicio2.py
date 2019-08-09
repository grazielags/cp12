'''2) Imprimir a soma de todos os números pares entre dois números
solicitados para o usuário.
'''

numero1= int(input("Escreva um numero"))
numero2= int(input("Escreva outro numero"))
soma=0
while numero1<=numero2:
   if numero1%2==0:
      soma = soma + numero1 
   numero1+=1 

print(soma)  
