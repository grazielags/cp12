'''4.	Faça um programa que pergunte o preço de três produtos e informe
qual produto você deve comprar, sabendo que a decisão é sempre pelo mais barato.  

'''

produto1= float(input("Escreva o valor do 1  produto\n"))
produto2= float(input("Escreva o valor do 2 produto\n"))
produto3= float(input("Escreva o valor do 3 produto\n"))



if produto1<produto2 and produto1<produto3:        
    print(produto1,"$")    
elif produto2<produto1 and produto2<produto3:
    print(produto2,"$")
elif produto3<produto1 and produto3<produto2:
    print(produto3,"$")


