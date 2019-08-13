"""
Calcule a quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 k/l.
Para obter o cálculo, o usuário deve fornecer (leia) o tempo gasto na viagem e a velocidade média durante ela.
Desta forma, será possível obter a distância percorrida com a fórmula distancia <- tempo * velocidade.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem
com a fórmula: litros <- distancia div 12. O programa deve apresentar (escreva) os valores da velocidade média,
tempo gasto na viagem, a distância percorrida e a quantidade de litros utilizada na viagem.
"""

tempo = int(input("Tempo de viagem: "))
veloc = int(input("Velocidade média da viagem: "))


distancia = (tempo*veloc)
litro = distancia/12    

print("Para uma viagem de ", distancia,"km em", tempo,"h", "com ", veloc, "kmq/h de velocidade, você vai precisar de", litro, "litros de combustível")

