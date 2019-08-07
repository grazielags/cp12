'''
4. Faça um programa que pergunte o preço de três produtos e informe
   qual produto você deve comprar, sabendo que a decisão é sempre
   pelo mais barato. 
'''


produto1 = float(input("Digite o valor do primeiro produto: "))
produto2 = float(input("Digite o valor do segundo produto: "))
produto3 = float(input("Digite o valor do terceiro produto: "))

if produto1 < produto2 and produto1 < produto3:
       print("O produto de:",produto1,"é o mais barato,compre!")
if produto2 < produto1 and produto2 < produto3:
       print("O produto de:",produto2,"é o mais barato,compre!")
else:
       print("O produto de:",produto3,"é o mais barato,compre!")
              







