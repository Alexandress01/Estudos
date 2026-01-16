# Contador de letras: receba uma frase e conte quantas letras tem (sem espaços)
frase = input("Escreva uma frase: ")

contador = 0
for letra in frase:
    if letra != " ":
        contador += 1

print("A frase tem", contador, "letras (sem contar os espaços).")