# Removendo elementos: crie uma lista e remova um item informado pelo usuário
lista = ['abacaxi', 'banana', 'laranja', 'uva', 'manga']

item_remover = input("Digite o nome da fruta que deseja remover da lista: ")

if item_remover in lista:
    lista.remove(item_remover)
    print(f"{item_remover} foi removido da lista.")
else:
    print(f"{item_remover} não está na lista.")

print("Lista atualizada:", lista)