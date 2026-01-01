# Classificação de nota: ≥ 9 → Excelente, ≥ 7 → Bom, ≥ 5 → Recuperação, < 5 → Reprovado

nota = float(input("Digite sua nota: "))

if nota >= 9:
    print("Excelente!")
elif nota >= 7:
    print("Bom")
elif nota >= 5:
    print("Recuperação")
else:
    print("Reprovado")