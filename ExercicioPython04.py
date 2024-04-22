salario = float(input('Qual é o salário do funcionário? R$'))
novo = salario + (salario *15/100)
print('O salário do funcionário é R${:.2f}, com o aumento de 15%, ficou R${:.2f}.'.format(salario, novo))
