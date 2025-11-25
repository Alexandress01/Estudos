def adicionar_tarefa():
    tarefa = input("Digite a tarefa que deseja adicionar: ")
    tarefas.append(tarefa)
    print(f"Tarefa '{tarefa}' adicionada com sucesso!")

def remover_tarefa():
    tarefa = input("Digite a tarefa que deseja remover: ")
    if tarefa in tarefas:
        tarefas.remove(tarefa)
        print(f"Tarefa '{tarefa}' removida com sucesso!")
    else:
        print(f"Tarefa '{tarefa}' não encontrada na lista.")

def listar_tarefas():
    if tarefas:
        print("Tarefas na lista:")
        for tarefa in tarefas:
            print(f"- {tarefa}")
    else:
        print("Nenhuma tarefa na lista.")

def limpar_tarefas():
    limpar = input("Deseja limpar todas as tarefas? (s/n): ")
    if limpar.lower() == 's':
        tarefas.clear()
        print("Todas as tarefas foram removidas.")
    else:
        print("Nenhuma tarefa foi removida.")

adicionar_tarefa()
listar_tarefas()
remover_tarefa()
listar_tarefas()
limpar_tarefas()