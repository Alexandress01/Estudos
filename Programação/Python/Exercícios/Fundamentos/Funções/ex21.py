# Função par ou ímpar: receba um número e retorne "par" ou "ímpar"
def parImpar(num):
    if num % 2 == 0:
        return "Par"
    else:
        return "Ímpar"
    
print(parImpar(12))