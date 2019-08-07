idade= int(input ("Quantos anos você tem?"))
if idade >= 16:
    print ("Você já tem idade para votar.")
    if idade == 16:
        print ("Parabéns, essa é sua primeira eleição.")
    elif idade == 17 or idade == 18:
        print ("Parbéns!") 
    print ("Escolha bem o melhor para o país.")
elif idade > 10 and idade < 16:
    print ("Você já tem idade para dominar o Python.")
else:
    print ("Deixe o vídeo game de lado e vá brincar no parque.")