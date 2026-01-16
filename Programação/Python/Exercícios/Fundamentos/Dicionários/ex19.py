# Notas por aluno: nome do aluno como chave, nota como valor. Mostre se cada aluno passou
notas_por_aluno = {
    "Alexandre": 10,
    "Israel": 8.9,
    "Diogo": 6.4,
    "Davi": 7.0
}

for aluno, nota in notas_por_aluno.items():
    if nota >= 7:
        print(f"O aluno {aluno} passou com a nota {nota}.")
    else:
        print(f"O aluno {aluno} não passou, sua nota foi {nota}.")