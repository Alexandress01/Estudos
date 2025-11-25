import mysql.connector

conexao = mysql.connector.connect (
    host = '192.168.1.5',
    user = 'admceeptic',
    password = '968574',
    database = 'bdlabotec',
)
cursor = conexao.cursor()

# CRUD
cursor.close()
conexao.close()

# CRUD em Python
# CREATE
nome_produto = "computador"
valor = 2500
comando = f'INSERT INTO vendas (nome_produto, valor) VALUES ("{nome_produto}", {valor})'
cursor.execute(comando)
conexao.commit() # salva quando edita o banco de dados


# READ
comando = f'SELECT * FROM vendas'
cursor.execute(comando)
resultado = cursor.fetchall() # ler o banco de dados
print(resultado)


# UPDATE
nome_produto = "computador"
valor = 6000
comando = f'UPDATE vendas SET valor = {valor} WHERE nome_produto = "{nome_produto}"'
cursor.execute(comando)
conexao.commit() # salva quando edita o banco de dados

# DELETE
nome_produto = "computador"
valor = 6000
comando = f'DELETE FROM vendas WHERE nome_produto = "{nome_produto}"'
cursor.execute(comando)
conexao.commit() # salva quando edita o banco de dados