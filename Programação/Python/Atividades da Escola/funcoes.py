def somarDois(n1, n2):
    return n1 + n2

resultado_soma = somarDois(5, 10)

def somarQuatro(n1, n2, n3, n4):
    return n1 + n2 + n3 + n4

resultado_soma_quatro = somarQuatro(4, 2, 13, 20)

def media(n1, n2, n3):
    return (n1 + n2 + n3) / 3

resultado_media = media(8.5, 10, 9)

def mostrarIdade(nome, ano_nascimento):
    idade = 2025 - ano_nascimento
    print(f"{nome}, você tem {idade} anos.")

print(f"Resultado da soma: {resultado_soma}")
print(f"Resultado da soma de quatro números: {resultado_soma_quatro}")
print(f"Resultado da média: {resultado_media:.1f}")
mostrarIdade("Jefferson", 1980)