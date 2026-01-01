# Maior e menor: receba 5 números, armazene numa lista e mostre o maior e o menor
nums = []

num1 = int(input("Digite o primeiro número: "))
num2 = int(input("Digite o segundo número: "))
num3 = int(input("Digite o terceiro número: "))
num4 = int(input("Digite o quarto número: "))
num5 = int(input("Digite o quinto número: "))

nums.append(num1)
nums.append(num2)
nums.append(num3)
nums.append(num4)
nums.append(num5)

print(f"Maior número da lista: {max(nums)}")
print(f"Menor número da lista: {min(nums)}")