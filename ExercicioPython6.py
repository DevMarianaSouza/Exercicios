km = float(input('Quantos quilômetros você percorreu?'))
dias = int(input('Quantos dias você alugou esse carro?'))
preço = (dias * 60) + (km * 0.15)
print('Se você alugou por {} dias e percorreu {:.2f}Km, você pagará o valor de R${:.2f}.'.format(dias, km, preço))
