
'''
8) Calcule a quantidade de litros de combustível gasta em uma viagem,
   utilizando um automóvel que faz 12 k/l. Para obter o cálculo, o usuário
   deve fornecer (leia) o tempo gasto na viagem e a velocidade média durante ela.
   Desta forma, será possível obter a distância percorrida com a fórmula
   distancia <- tempo * velocidade.
   Tendo o valor da distância, basta calcular a quantidade de litros de combustível
   utilizada na viagem com a fórmula: litros <- distancia div 12. O programa deve
   apresentar (escreva) os valores da velocidade média, tempo gasto na viagem,
   a distância percorrida e a quantidade de litros utilizada na viagem.
'''

tempo = float(input('Digite o Tempo de Viagem: '))
velocidade = int(input('Digite a Velocidade Média: '))

distancia = tempo * velocidade

litros = distancia / 12
print('Com o tempo de:',tempo,'Hrs','e Velocidade média de:',velocidade,'km/hr ;','A viagem foi de',distancia,'km','e consumiu:',litros,'Litros de combustível.')


