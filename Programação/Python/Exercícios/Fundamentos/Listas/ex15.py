# Removendo elementos: crie uma lista e remova um item informado pelo usuário
lista = ['abóbora', 12, True, 'cacete']

print("Lista atual:", lista)
print("Qual item deseja remover?")
item = input("Digite o item: ")
if item.isdigit():
    item = int(item)
if item in lista:
    lista.remove(item)
    print(f"Item '{item}' removido. Lista atualizada: {lista}")
else:
    print(f"Item '{item}' não encontrado na lista. Lista permanece: {lista}")