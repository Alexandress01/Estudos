-- Aula 03: Inserindo Dados na Tabela (INSERT INTO)
-- Aprendi:
-- - Como inserir valores com INSERT INTO
-- - Como selecionar algo da tabela com INSERT FROM
-- - O que é DDL (Data Definition Language)
-- - O que é DML (Data Manipulation Language)

INSERT INTO pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
VALUES
(DEFAULT, 'Cláudio', '1975-04-22', 'M', '99.0', '2.15', 'Brasil'),
(DEFAULT, 'Pedro', '2000-07-15', 'M', '52.3', '1.45', DEFAULT),
(DEFAULT, 'Janaina', '1999-05-30', 'F', '75.9', '1.70', 'EUA');

SELECT * FROM pessoas;