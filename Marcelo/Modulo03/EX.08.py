temp= int(input("Escreva o tempo de viagem em horas?!"))
print (temp)
velo= int(input("Agora escreva a velocidade MEDIA do veiculo em Km/h?!"))
print (velo)

dp= (temp*velo)
qdl= (dp//12)
print(" A distancia percorrida é de  ",dp,"KM")
print(" O consumo do carro foi de ",qdl,"L lembrando que o veiculo faz 12km/L")
