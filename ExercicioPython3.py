preço = float(input('Qual é o preço do produto? R$'))
pcomdesc = preço - (preço*5/100)
print('O produto que custava R${:.2f}, com desconto de 5% vai custar R${:.2f}.'.format(preço, pcomdesc))
