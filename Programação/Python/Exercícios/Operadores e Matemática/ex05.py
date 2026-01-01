# Média: receba três notas, calcule a média e mostre se foi aprovado (>= 7)
nota1 = float(input("Digite a primeira nota: "))
nota2 = float(input("Digite a segunda nota: ")) 
nota3 = float(input("Digite a terceira nota: "))

media = (nota1 + nota2 + nota3) / 3
resultado = "Aprovado!" if media >= 7 else "Reprovado!"

print(f"Média: {media:.1f}")
print(resultado)