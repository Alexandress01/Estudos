# Somatório: some todos os números de 1 até N (informado pelo usuário)
num = int(input("Digite um número para a soma: "))
soma = 0

for i in range(1, num + 1):
    soma += i

print(f"A soma de 1 até {num} é: {soma}")