# Tabuada: receba um número e mostre a tabuada dele (1 a 10)
num = float(input("Digite um número: "))

for x in range(11):
    print(f"{num} x {x}: {num * x}")
    x += 1