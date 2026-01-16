# Set (sem repetição): receba 5 números, armazene em um set e mostre os valores únicos
numeros = set()

for x in range(5):
    numeros.add(int(input(f"Digite o número {x + 1}: ")))

print(f"Valores únicos Set: {numeros}")